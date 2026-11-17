# Tourist API

Spring Boot REST API using PostgreSQL. The `GET /api/tourists` endpoint requires a custom `Token` request header.

## Requirements
- Java 17
- PostgreSQL
- Maven (or Maven Wrapper from your own Spring Initializr project)

## Database
Create a database named `tourism_db` in PostgreSQL. Run `database/schema.sql` using pgAdmin's Query Tool if the `tourists` table does not already exist. If you already created and populated the table, do not run the sample INSERT statements again.

## Configure credentials

In PowerShell, from the project folder:

```powershell
$env:DB_PASSWORD="your_actual_postgres_password"
$env:API_TOKEN="VALID_TOKEN_123"
```

Replace the token with the pre-generated token supplied for your assignment, if one was provided.

## Run

If Maven is installed:

```powershell
mvn spring-boot:run
```

If your project includes the Maven wrapper:

```powershell
.\mvnw.cmd spring-boot:run
```

The server starts at `http://localhost:8080`.

## Test the endpoint

Request:

```http
GET http://localhost:8080/api/tourists
Token: VALID_TOKEN_123
```

PowerShell example:

```powershell
Invoke-RestMethod -Uri "http://localhost:8080/api/tourists" -Headers @{ Token = "VALID_TOKEN_123" }
```

Expected behavior:
- Missing `Token` header: HTTP 401 with `Token header is missing`.
- Incorrect token: HTTP 401 with `Invalid token`.
- Valid token: HTTP 200 with all tourist records as JSON.

The sample token is only a local placeholder. Configure the actual pre-generated token required by your assignment before submission.

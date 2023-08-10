# Sweep_AI_Testing

## Running the Application

To run the application, use the following command in the root directory of the project:

```
./mvnw spring-boot:run
```

## Using the New Endpoint

The new endpoint is a POST request to `/data`. The request body should be a JSON object with the data to be inserted into the database.

## Environment Variables

The following environment variables are required for the database connection:

* `DATABASE_URL`: The URL of the Postgres database.
* `DATABASE_USERNAME`: The username for the database.
* `DATABASE_PASSWORD`: The password for the database.
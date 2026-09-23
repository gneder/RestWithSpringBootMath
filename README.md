# RestWithSpringBootMath

A small Spring Boot REST API exposing basic math operations (sum, subtraction, multiplication, division, mean, square root), originally built while following a Spring Boot course.

Lives in [`RestWithSpringBootCalculator/`](RestWithSpringBootCalculator), on Spring Boot 3.3.5 / Java 21.

## Endpoints

- `GET /sum/{a}/{b}`
- `GET /subtraction/{a}/{b}`
- `GET /multiplication/{a}/{b}`
- `GET /division/{a}/{b}`
- `GET /mean/{a}/{b}`
- `GET /squareRoot/{n}`

Non-numeric input returns `400 Bad Request`.

## Run locally

```bash
cd RestWithSpringBootCalculator
mvn spring-boot:run
```

## Run tests

```bash
cd RestWithSpringBootCalculator
mvn test
```

## CI

Runs on every push via GitHub Actions (`.github/workflows/ci.yml`).

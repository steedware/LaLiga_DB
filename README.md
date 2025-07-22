# LaLiga Statistics Dashboard

**Author**: steedware

A web application presenting LaLiga football statistics, integrating with the football-data.org API.

## Features

- Team and player overview
- Top scorers rankings
- Recent matches
- Team and player search functionality
- Detailed statistics

## Technologies

- **Backend**: Java 17, Spring Boot 3.x
- **Frontend**: Thymeleaf, Bootstrap 5
- **API**: [football-data.org](https://www.football-data.org/)
- **Database**: H2/MySQL (configurable)
- **Tools**: Maven, Lombok

## Quick Start

### Requirements

- Java 17+
- Maven 3.8+
- Docker 20.10+
- API key from [football-data.org](https://www.football-data.org/)

```bash
# 1. Clone the repository
git clone https://github.com/steedware/LaLiga_DB.git
cd LaLiga_DB

# 2. Configure API key
application.properties  ---> "FOOTBALL_API_KEY=your_key" 

# 3. Start containers
docker-compose up -d

# Application will be available at:
http://localhost:8080
```

# LaLiga Statistics Dashboard ⚽📊

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)

Aplikacja webowa prezentująca statystyki piłkarskie LaLigi, integrująca się z API football-data.org.

## ✨ Funkcje
- Przegląd drużyn i zawodników
- Rankingi strzelców
- Ostatnie mecze
- Wyszukiwarka drużyn i zawodników
- Szczegółowe statystyki

## 🛠 Technologie
- **Backend**: Java 17, Spring Boot 3.x
- **Frontend**: Thymeleaf, Bootstrap 5
- **API**: [football-data.org](https://www.football-data.org/)
- **Baza danych**: H2/MySQL (konfigurowalna)
- **Narzędzia**: Maven, Lombok

## 🚀 Szybki start

### Wymagania
- Java 17+
- Maven 3.8+
- Docker 20.10+
- Klucz API z [football-data.org](https://www.football-data.org/)

```bash
# 1. Sklonuj repozytorium
git clone https://github.com/steedware/LaLiga_DB.git
cd LaLiga_DB

# 2. Skonfiguruj klucz API
application.properties  ---> "FOOTBALL_API_KEY=twój_klucz" 

# 3. Uruchom kontenery
docker-compose up -d

# Aplikacja będzie dostępna pod:
http://localhost:8080

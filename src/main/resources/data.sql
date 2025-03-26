--- Dane, używane do testowania bazy danych ------


-- Przykładowe drużyny
INSERT INTO team (id, name, short_name, tla, crest_url, points, position) VALUES
(86, 'Real Madrid CF', 'Real Madrid', 'RMA', 'https://crests.football-data.org/86.png', 85, 1),
(81, 'FC Barcelona', 'Barcelona', 'FCB', 'https://crests.football-data.org/81.png', 80, 2);

-- Przykładowi zawodnicy
INSERT INTO player (id, name, position, shirt_number, nationality, date_of_birth, photo_url, goals, assists, yellow_cards, red_cards, minutes_played, team_id) VALUES
(1, 'Karim Benzema', 'Forward', 9, 'French', '1987-12-19', 'https://img.a.transfermarkt.technology/portrait/big/18999-1671434735.jpg', 25, 10, 3, 0, 2500, 86),
(2, 'Robert Lewandowski', 'Forward', 9, 'Polish', '1988-08-21', 'https://img.a.transfermarkt.technology/portrait/big/38253-1671434735.jpg', 23, 8, 2, 0, 2400, 81);

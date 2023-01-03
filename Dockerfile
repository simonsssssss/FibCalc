# Wybranie obrazu bazowego dla tworzonego obrazu

FROM eclipse-temurin:17-jdk-jammy

# Okreslenie katalogu roboczego kontenera

WORKDIR /app

# Skopiowanie kodu zrodlowego aplikacji do katalogu /app kontenera

COPY ./src/main/java/com/mycompany/fibcalc/ ./

# Wykonanie programu FibCalc podczas uruchamiania kontenera

CMD ["java","FibCalc.java"]

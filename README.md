# Projekt Kalkulatora

## Opis
Ten projekt to prosty kalkulator w języku Java, który można łatwo rozszerzać o nowe funkcje. Obsługuje dynamiczne ładowanie operacji matematycznych przy użyciu wzorców projektowych **Strategii** i **Fabryki Abstrakcyjnej**.

## Funkcje
- Wykonywanie podstawowych operacji matematycznych, takich jak dodawanie, odejmowanie, mnożenie i dzielenie.
- Łatwe rozszerzanie o nowe operacje bez modyfikacji istniejącego kodu.
- Wykorzystanie wzorców projektowych zapewniających czytelny, łatwy w utrzymaniu i skalowalny kod.

## Przegląd kodu

### Kluczowe komponenty

1. **Interfejs `Operation`**
   - Definiuje jedną metodę: `execute(double a, double b)`.
   - Reprezentuje strategię dla operacji matematycznych.

2. **Konkretne operacje**
   - `AdditionOperation`: Implementuje dodawanie.
   - `SubtractionOperation`: Implementuje odejmowanie.
   - `MultiplicationOperation`: Implementuje mnożenie.
   - `DivisionOperation`: Implementuje dzielenie (z obsługą błędu dzielenia przez zero).

3. **Interfejs `OperationFactory`**
   - Odpowiada za tworzenie obiektów typu `Operation`.

4. **`DefaultOperationFactory`**
   - Implementuje `OperationFactory`.
   - Używa instrukcji `switch` do dynamicznego zwracania odpowiedniej instancji `Operation` na podstawie wejścia.

5. **Klasa `Calculator`**
   - Działa jako klient dla `OperationFactory`.
   - Przyjmuje typ operacji i wartości wejściowe, a następnie wykonuje obliczenia przy użyciu odpowiedniej strategii.

### Interakcje klas
1. Klasa `Calculator` deleguje tworzenie operacji do fabryki.
2. Fabryka dynamicznie wybiera i tworzy odpowiednią strategię operacji.
3. Wybrana strategia operacji wykonuje logikę obliczeń.

### Przykład użycia
```java
OperationFactory factory = new DefaultOperationFactory();
Calculator calculator = new Calculator(factory);

System.out.println("Dodawanie: " + calculator.calculate("add", 10, 5)); // Wynik: 15.0
System.out.println("Odejmowanie: " + calculator.calculate("subtract", 10, 5)); // Wynik: 5.0
System.out.println("Mnożenie: " + calculator.calculate("multiply", 10, 5)); // Wynik: 50.0
System.out.println("Dzielenie: " + calculator.calculate("divide", 10, 5)); // Wynik: 2.0
```

## Zastosowane wzorce projektowe

### 1. Wzorzec Strategii
- **Cel**: Hermetyzacja rodziny algorytmów (operacji) i umożliwienie ich wymienności.
- **Zastosowanie**: Każda operacja matematyczna (dodawanie, odejmowanie, itd.) jest zaimplementowana jako osobna klasa implementująca wspólny interfejs (`Operation`).
- **Korzyść**: Dodanie nowej operacji wymaga utworzenia nowej klasy bez modyfikacji istniejącego kodu, co jest zgodne z zasadą otwarte-zamknięte.

### 2. Wzorzec Fabryki Abstrakcyjnej
- **Cel**: Dostarczenie interfejsu do tworzenia rodzin powiązanych obiektów bez określania ich konkretnych klas.
- **Zastosowanie**: Interfejs `OperationFactory` i jego implementacja (`DefaultOperationFactory`) dynamicznie tworzą instancje `Operation` na podstawie wejścia.
- **Korzyść**: Oddzielenie klienta (`Calculator`) od konkretnych implementacji operacji, co zwiększa elastyczność i łatwość utrzymania.

## Dlaczego te wzorce?

### Modułowość i skalowalność
- Wzorzec Strategii umożliwia dodawanie nowych operacji (np. potęgowanie, modulo) bez modyfikacji klasy `Calculator` lub innych klas operacji.

### Separacja odpowiedzialności
- Fabryka Abstrakcyjna izoluje logikę tworzenia instancji od kodu klienta, co ułatwia modyfikację lub wymianę logiki tworzenia w przyszłości.

### Czysty kod
- Przestrzeganie zasad SOLID zapewnia, że kod jest łatwy w utrzymaniu i dostosowywaniu do przyszłych wymagań.

## Jak rozszerzyć
1. Utwórz nową klasę implementującą interfejs `Operation`.
2. Dodaj nowy typ operacji do `DefaultOperationFactory`.
3. Nowa operacja będzie automatycznie dostępna w klasie `Calculator` bez żadnych dodatkowych modyfikacji.

## Możliwe przyszłe ulepszenia
- Dodanie obsługi zaawansowanych operacji (np. trygonometrycznych, logarytmicznych).
- Wprowadzenie dynamicznego ładowania operacji przy użyciu refleksji, aby wyeliminować konieczność modyfikowania fabryki.
- Dodanie testów jednostkowych dla wszystkich komponentów.

## Wymagania i uruchomienie
Projekt wymaga Javy 8 lub nowszej. Wystarczy sklonować repozytorium, skompilować kod i uruchomić klasę `Main`.
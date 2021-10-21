# Zad2-PPKWU

API sprawdzające jaki string został przekazany.
Sprawdza występowanie służych i małych znaków,liczb,znaków specjalnych i dowolnych ich kombinacji.

## Jak należy stosować 
```haml
localhost:8080/{tutaj wpisujemy text do analizy}
```

## Przykład użycia
```haml

localhost:8080/Test 4545 koniec

```

## Wynik działania 
```haml
{
"givenString": "Test 4545 koniec",
"length": 16,
"letter": 10,
"lowerCase": 9,
"upperCase": 1,
"number": 4,
"whiteSpace": 2,
"specialChar": 0
}
```

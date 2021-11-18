# API

API służące do wyświetlania informacji o podanym ciągu znaków takich jak liczba cyfr, liczba znaków specjalnych itp. w
czterech formatach: TXT, JSON, XML oraz CSV.

## Użycie

Aby skorzystać z API, należy wysłać żądanie GET pod wybrany endpoint (w zależności od formatu, w jakim chcemy otrzymać
dane o naszym ciągu znaków):

```
ścieżka_do_api/{format wejściowy}/{format wyjściowy}/{tekst}
ścieżka_do_api/{format wejściowy}/{format wyjściowy}/{tekst}
ścieżka_do_api/{format wejściowy}/{format wyjściowy}/{tekst}
ścieżka_do_api/{format wejściowy}/{format wyjściowy}/{tekst}
```

## Przykłady

```
1. http://localhost:8082/api/txt/xml/Happy%20New%202022%20Year!
2. http://localhost:8082/api/json/csv/Happy%20New%202022%20Year!
3. http://localhost:8082/api/xml/txt/Happy%20New%202022%20Year!
4. http://localhost:8082/api/csv/json/Happy%20New%202022%20Year!
5. http://localhost:8082/api/txt/json/Happy%20New%202022%20Year!
```

## Wyniki dla poszczególnych przykładów użycia API

### 1. Konwersja z formatu tekstowego do XML

```
http://localhost:8082/api/txt/xml/Happy%20New%202022%20Year!
```

```
Text: Happy New 2022 Year!
Digits: 4
Upper case: 3
Lower case: 9
Whitespace: 3
Special characters: 1
```

### 2. Konwersja z formatu JSON do CSV

```
http://localhost:8082/api/json/csv/Happy%20New%202022%20Year!
```

```
upperCase,lowerCase,specialCharacters,digits,text,whitespace
3,9,1,4,Happy New 2022 Year!,3
```

### 3. Konwersja z formatu XML do formatu tekstowego

```
http://localhost:8082/api/xml/txt/Happy%20New%202022%20Year!
```

```
Text: Happy New 2022 Year!
Digits: 4
Upper case: 3
Lower case: 9
Whitespace: 3
Special characters: 1
```

### 4. Konwersja z formatu CSV do formatu JSON

```
http://localhost:8082/api/csv/json/Happy%20New%202022%20Year!
```

```json
{
  "specialCharacters": "1",
  "digits": "4",
  "text": "Happy New 2022 Year!",
  "whitespace": "3",
  "upperCase": "3",
  "lowerCase": "9"
}
```

### 5. Konwersja z formatu TXT do formatu JSON

```
http://localhost:8082/api/txt/json/Happy%20New%202022%20Year!
```

```json
{
  "upperCase": 3,
  "lowerCase": 9,
  "specialCharacters": 1,
  "digits": 4,
  "text": "Happy New 2022 Year!",
  "whitespace": 3
}
```
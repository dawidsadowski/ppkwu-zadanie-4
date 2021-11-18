# API

API służące do wyświetlania informacji o podanym ciągu znaków takich jak liczba cyfr, liczba znaków specjalnych itp. w
czterech formatach: TXT, JSON, XML oraz CSV. 

API wykorzystuje serwis do pozyskiwania informacji o podanym ciągu znaków i konwertuje otrzymane dane w formacie
podanym przez uzytkownika API do formatu podanego w drugim parametrze.

## Użycie

Aby skorzystać z API, należy wysłać żądanie GET pod wybrany endpoint (podając format wejściowy oraz wyjściowy,
a także ciąg znaków o którym chcemy otrzymać informacje):

```
ścieżka_do_api/{format wejściowy}/{format wyjściowy}/{tekst}
ścieżka_do_api/{format wejściowy}/{format wyjściowy}/{tekst}
ścieżka_do_api/{format wejściowy}/{format wyjściowy}/{tekst}
ścieżka_do_api/{format wejściowy}/{format wyjściowy}/{tekst}
```

## Przykłady

```
1. http://localhost:8082/stringapi/txt/xml/Happy%20New%202022%20Year!
2. http://localhost:8082/stringapi/json/csv/Happy%20New%202022%20Year!
3. http://localhost:8082/stringapi/xml/txt/Happy%20New%202022%20Year!
4. http://localhost:8082/stringapi/csv/json/Happy%20New%202022%20Year!
5. http://localhost:8082/stringapi/txt/json/Happy%20New%202022%20Year!
```

## Wyniki dla poszczególnych przykładów użycia API

### 1. Konwersja z formatu tekstowego do XML

```
http://localhost:8082/stringapi/txt/xml/Happy%20New%202022%20Year!
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
http://localhost:8082/stringapi/json/csv/Happy%20New%202022%20Year!
```

```
upperCase,lowerCase,specialCharacters,digits,text,whitespace
3,9,1,4,Happy New 2022 Year!,3
```

### 3. Konwersja z formatu XML do formatu tekstowego

```
http://localhost:8082/stringapi/xml/txt/Happy%20New%202022%20Year!
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
http://localhost:8082/stringapi/csv/json/Happy%20New%202022%20Year!
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
http://localhost:8082/stringapi/txt/json/Happy%20New%202022%20Year!
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

# API konwersji danych archiwalnych
API służy do konwersji danych archiwalnych (zapisanych w formatach TXT, JSON, XML, CSV) na dowolny format 
z następujących: TXT, JSON, XML, CSV

## Użycie

Aby skorzystać z API, należy wysłać żądanie GET z danymi o formacie wejściowym oraz wyjściowym podanego kolejno ciągu
znaków:

```
ścieżka_do_api/{format wejściowy}/{format wyjściowy}/{tekst}
ścieżka_do_api/{format wejściowy}/{format wyjściowy}/{tekst}
ścieżka_do_api/{format wejściowy}/{format wyjściowy}/{tekst}
ścieżka_do_api/{format wejściowy}/{format wyjściowy}/{tekst}
```

## Przykłady

```
1. http://localhost:8082/convertapi/txt/json/Text:%20Happy%20New%202022%20Year!%0ADigits:%204%0AUpper%20case:%203%0ALower%20case:%209%0AWhitespace:%203%0ASpecial%20characters:%201
2. http://localhost:8082/convertapi/json/xml/%7B%20%22upperCase%22:%203,%20%22lowerCase%22:%209,%20%22specialCharacters%22:%201,%20%22digits%22:%204,%20%22text%22:%20%22Happy%20New%202022%20Year!%22,%20%22whitespace%22:%203%20%7D

```
## Wyniki dla poszczególnych przykładów użycia API

### 1. Konwersja z formatu tekstowego do JSON

```
http://localhost:8082/convertapi/txt/json/Text:%20Happy%20New%202022%20Year!%0ADigits:%204%0AUpper%20case:%203%0ALower%20case:%209%0AWhitespace:%203%0ASpecial%20characters:%201
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

### 2. Konwersja z formatu JSON do XML

```
http://localhost:8082/convertapi/json/xml/%7B%20%22upperCase%22:%203,%20%22lowerCase%22:%209,%20%22specialCharacters%22:%201,%20%22digits%22:%204,%20%22text%22:%20%22Happy%20New%202022%20Year!%22,%20%22whitespace%22:%203%20%7D
```

```xml
<stringData>
    <upperCase>3</upperCase>
    <lowerCase>9</lowerCase>
    <specialCharacters>1</specialCharacters>
    <digits>4</digits>
    <text>Happy New 2022 Year!</text>
    <whitespace>3</whitespace>
</stringData>
```
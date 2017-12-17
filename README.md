# JAVA-16

1. Susikurti naują projektą su [ShoppingCart](https://github.com/vcschool/JAVA-16/blob/master/main/java/lt/vcs/cart/ShoppingCart.java) klase ir ištestuoti visus jos metodus.

2. String Calculator (TDD)

  Prieš pradedant:
  * Neskubėk perskaityti visos užduoties ir užbėgti įvykiams už akių.
  * Daryk užduotis po vieną iš eilės.
  * Nerašyk testų, nesusijusių su konkrečiomis užduotimis.
Sukuti StringCalculator klasę su metodu Add(string numbers)

Metodas gali priimti 0, 1 ar 2 skaičius, ir grazinti sumą (tuščias stringas = 0) pvz: “” or “1” or “1,2”/
  * Pradėk rašyti testą nuo papraščiausių atvejų empty string, vienas skaičius, du skaičiai ir t.t.
  * Nepamiršk implementuotį kodą kuo papraščiau.
  * Nepamiršk refactor žingsnio.
Įgalinti add metodą sumuoti neribotą skaičiu skaitmenų.

Jei paduodamas neigiamas skaičius, išmetamas IllegalArgumentException. Jei yra daugiau nei vienas neigiamas skaičius, jie išvardinami exception message.

Įgalinti add metodą ignuoroti eilutės nukelimą \n.

Skaičiai didesni už 1000 ignoruojami pvz.: 2 + 1001 = 2.

3. Susikurti nutolusę saugyklą (remote repository) GitHub'e ir panaudojant git įkelti šiandienos darbą.

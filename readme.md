# Cvičení Java stream API, Java Optional

- Vypište všechny obědy včetně polévky a nápoje podávané dnes (29.11.2023)
- Ze seznamu dnes nabízených jídel vypište pouze názvy jídel (name) použijte funkci map()
- Vypište všechny názvy (name) hlavních jídel (kind.equals(LunchItemKind.MAIN_DISH) seřazené podle abecedy
- Vypište všechna hlavní jídla bez alergenů. Vypište pouze názvy jídel (name)
- Vypište datumy kdy je jako nápoj podáván "Ovocný nápoj", nebo "Sirup"
- Vypište všechna přihlášená jídla vypište druh jídla (menuOption) a název jídla (name)
    * formát: menuOption: name ("oběd1: Vepřová plec na žampiónech, rýže")
- Vypište cenu všech objednaných jídel, nebo vraťte výchozí hodnotu 0 pokud je vložen prázdný list, nebo vložený list neobsahující žádné z přihlášených jídel
- Seskupte obědy do mapy (Map<String, List<LunchItem>>) kde klíčem bude datum výdeje jídla (date)
  a hodnotou List jídel nabízených v daný den. Použijte funkci groupBy()
- Seskupte obědy do Mapy podle jejich alergenů Map<List<Allergen>, List<LunchItem>> kdy klíčem bude list obsažených alergenů
  a hodontou List jídel obashující dané alergeny.
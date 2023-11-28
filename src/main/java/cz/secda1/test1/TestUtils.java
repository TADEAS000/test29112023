package cz.secda1.test1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestUtils {

    /**
     * Vypište všechny obědy včetně polévky a nápoje podávané dnes (29.11.2023)
     */
    public static List<LunchItem> todaysMenu(List<LunchItem> lunchItems, String todaysDate) {
        return null;
    }

    /**
     * Ze seznamu dnes nabízených jídel vypište pouze názvy jídel (name) použijte funkci map()
     *
     * @param lunchItems
     * @param todaysDate
     * @return
     */
    public static List<String> todaysMenuFilterNames(List<LunchItem> lunchItems, String todaysDate) {
        return null;
    }

    /**
     * Vypište všechny názvy (name) hlavních jídel (kind.equals(LunchItemKind.MAIN_DISH) seřazené podle abecedy
     *
     * @param lunchItems
     * @return
     */
    public static List<String> getAllMainDishesSorted(List<LunchItem> lunchItems) {
        return null;
    }

    /**
     * Vypište všechna hlavní jídla bez alergenů. Vypište pouze názvy jídel (name)
     *
     * @param lunchItems
     * @return
     */
    public static List<String> getAllMainDishesWithoutAllergens(List<LunchItem> lunchItems) {
        return null;
    }

    /**
     * Vypište datumy kdy je jako nápoj podáván "Ovocný nápoj", nebo "Sirup"
     *
     * @param lunchItems
     * @return
     */
    public static List<String> getDatesWhenDrinkIsFruitDrinkOrSyrup(List<LunchItem> lunchItems) {
        return null;
    }


    /**
     * Vypište všechna přihlášená jídla vypište druh jídla (menuOption) a název jídla (name)
     * formát: menuOption: name
     *
     * @param lunchItems
     * @return
     * @example: "oběd1: Vepřová plec na žampiónech, rýže"
     */
    public static List<String> getAllOrderedDishes(List<LunchItem> lunchItems) {
        return null;
    }

    /**
     * Vypište cenu všech objednaných jídel, nebo vraťte výchozí hodnotu O pokud je vložen prázdný list, nebo list neobsahující žádné z přihlášených jídel
     *
     * @param lunchItems
     * @return
     */
    public static Double getSumOfAllOrderedMeals(List<LunchItem> lunchItems) {
        return null;
    }

    /**
     * Seskupte obědy do mapy (Map<String, List<LunchItem>>) kde klíčem bude datum výdeje jídla (date)
     * a hodnotou List jídel nabízených v daný den. Použijte funkci groupBy()
     *
     * @param lunchItems
     * @return
     */
    public static Map<String, List<LunchItem>> groupMealsByDate(List<LunchItem> lunchItems) {
        return null;
    }

    /**
     * Seskupte obědy do Mapy podle jejich alergenů Map<List<Allergen>, List<LunchItem>> kdy klíčem bude list obsažených alergenů
     * a hodontou List jídel obashující dané alergeny.
     *
     * @param lunchItems
     * @return
     */
    public static Map<List<Allergen>, List<LunchItem>> groupMealsByAllergens(List<LunchItem> lunchItems) {
        return null;
    }
}

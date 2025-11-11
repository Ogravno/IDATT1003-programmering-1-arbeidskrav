package oppgave2;

import java.util.ArrayList;
import java.util.List;

public class Oppgave2 {
  private static void printDish(Dish dish) {
    System.out.println(dish.getName() + ", " + dish.getType() + ", " + dish.getPrice());
  }

  public static void main(String[] args) {
    MenuRegister menus = new MenuRegister();

    menus.addDish("Laksefilet med saltkokte poteter", "hovedrett", 200, "Poteter: Kok potetene møre i lettsaltet vann. Hell av vannet og sett til side slik at potetene kan dampe seg tørre.\n" +
            "2\n" +
            "Laks: Krydre laksen med salt og pepper. Stek dem i litt nøytral olje ved høy varme i 2 minutter på hver side.\n" +
            "3\n" +
            "Skru ned varmen og ha creme fraichen i stekepannen sammen med laksen. La det surre i ytterligere 2-3 minutter.\n" +
            "Tips!\n" +
            "Tilsett gjerne litt mangochutney for ekstra smak.\n" +
            "4\n" +
            "Blomkål og brokkoli: Kok bukettblandingen i lettsaltet vann i ca 2 minutter til grønnsakene akkurat er ferdigkokt. Du kan bruke fryste eller ferske grønnsaker.\n" +
            "5\n" +
            "Server laks i en herlig creme fraiche-saus sammen med brokkoli, blomkål og kokte poteter.");
    menus.addDish("Yoghurtbrød med svinesnadder", "hovedrett", 250, "Yoghurtbrød: Lag enkle yoghurtbrød ved å følge \n" +
            "denne oppskriften.\n" +
            "\n" +
            "2\n" +
            "Fyll: Stek svinesnadderet i en stekepanne til kjøttet er gjennomvarmt og gyllent.\n" +
            "3\n" +
            "Del cherrytomatene i to og finhakk koriander.\n" +
            "4\n" +
            "Anrett svinesnadderet på yoghurtbrødet med salat, tomater, yoghurt, syltet rødløk og koriander.");
    menus.addDish("Frisk salat med appelsindressing", "forrett", 150, "Salat: Kok havreris som anvist på pakken.\n" +
            "Tips!\n" +
            "Kok gjerne havrerisen med litt grønnsaksbuljong eller litt appelsinjuice for mer smak.\n" +
            "2\n" +
            "Skrell og skjær appelsinen i skiver. Skjær eple og fennikel tynt.\n" +
            "\n" +
            "3\n" +
            "Legg eple og fennikel i kaldt vann i ca. 20 min for å gjøre de ekstra sprø.\n" +
            "4\n" +
            "Rist gresskarfrø i en tørr, varm panne. Det tar ca 2 minutter.\n" +
            "5\n" +
            "Appelsindressing: Press hvitløken, og pisk alle ingrediensene raskt sammen til en frisk vinaigrette.\n" +
            "6\n" +
            "Bland en salat av havreris, appelsin eple og fennikel. Topp med gresskarfrø, salattopper og basilikum.\n" +
            "7\n" +
            "Server med bøffelmozzarella i skiver og frisk appelsindressing.");
    menus.addDish("Heksegryte til Halloween", "desert", 125, "1\n" +
            "Før du starter: Varm ovnen til 180 grader.\n" +
            "2\n" +
            "Gresskarkjerner: Del gresskaret, eller skjær ut toppen eller bunnen dersom du skal bruke det til Halloween. Ta ut gresskarkjernene, spre dem utover et bakebrett og tørk dem med tørkepapir. Ha over litt olje og flaksalt. Stek midt i ovnen i ca. 15 minutter til de blir lett gylne og sprø. Avkjøl.\n" +
            "3\n" +
            "Ovnsbakt gresskar til gryte: Mens gresskarkjernene er i ovnen skjærer du gresskarkjøttet i jevne, grove biter.\n" +
            "\n" +
            "4\n" +
            "Knus de uskrelte hvitløkfeddene med bredsiden av en kniv, og del løken i to.\n" +
            "\n" +
            "5\n" +
            "Fordel gresskar, løk og hvitløk utover et stekebrett med bakepapir, ringle over olivenolje og dryss over salt og pepper.\n" +
            "6\n" +
            "Bak alt i ovnen i ca. 30-40 minutter, til gresskarbitene er helt møre og løken er bløt.\n" +
            "7\n" +
            "Ha grønnsakene over i en gryte og hell over buljong. Hvitløken klemmer du ut av skallet, og kaster skallet. Kok opp buljongen i en kjele. Kjør suppen jevn og glatt med en stavmikser.\n" +
            "8\n" +
            "Smak til med noen gode dråper sitronsaft og juster smaken med salt og pepper.");
    menus.addDish("Spicy vegetar tostadas", "forrett", 175, "Ovnsbakt søtpotet: Skrell søtpotetene og del dem opp i terninger. Vend bitene i olivenolje og kryddermiks, og legg dem på bakebrett eller i en ildfast form. Stek midt i ovnen på 200 grader i ca 30 minutter til de er møre og lett karamelliserte.\n" +
            "\n" +
            "2\n" +
            "Tostadas: Varm oljen i en stekepanne til 180 grader. Friter så maistortillaene én og én til de er gylne og sprø. Bruk en pølseklype eller lignende og legg dem over i liten kopp eller bolle, slik at de formes til skåler. La dem avkjøles.\n" +
            "Tips!\n" +
            "Dersom du ikke har steketermometer til å måle temperaturen på oljen kan du bruke en tresleiv. Ha tresleiven ned i oljen, dersom det bruser er oljen varm nok.\n" +
            "3\n" +
            "Tilbehør: Stek ananasen i en stekepanne eller grillpanne til bitene er gylne.\n" +
            "4\n" +
            "Dander ingrediensene i tortillaformene med salat i bunnen, så søtpotet, stekt ananas og resten av ingrediensene. Topp til slutt med frisk koriander.");
    menus.addDish("Gresskarcupcakes", "desert", 100, "1. Pisk smør, sukker og frøene fra en vaniljestang sammen til det har en luftig konsistens. Ha i ett og ett egg om gangen.\n" +
            "\n" +
            "2. Vend forsiktig inn siktet mel og bakepulver i blandingen. Spe med fløte og bland røren godt sammen.\n" +
            "\n" +
            "3. Sett muffinsformer i et muffinsbrett. Har du ikke muffinsbrett kan du bruke doble former for at cupcakesene skal holde formen bedre. Fordel røren i formene og stek cupcakesene på 180 °C midt i stekeovnen i 15-20 minutter. Avkjøl.\n" +
            "\n" +
            "4. Knekk sjokolade i biter og ha dem i en bolle. Sett bollen over en liten kjele med vann (vannbad). Obs! Bollen bør ikke komme i kontakt med vannet, da det kan bli for varmt for sjokoladen.\n" +
            "\n" +
            "5. Sett kjelen på kokeplaten og la vannet småkoke. Rør i sjokoladen innimellom, og ta den av platen straks den har smeltet. Du kan også smelte sjokoladen i mikrobølgeovn.\n" +
            "\n" +
            "6. Kjør romtemperert smør og melis sammen i en kjøkkenmaskin med K-visp til blandingen er luftig og lys gul, ca. 5 minutter.\n" +
            "\n" +
            "7. Hell avkjølt, smeltet sjokolade i bollen og pisk til alt er godt blandet, 5-7 minutter. Obs! Er sjokoladen for varm vil kremen sprekke.\n" +
            "\n" +
            "8. Ta noen spisekjeer av sjokoladekremen over i en bolle og ha i litt grønn konditorfarge. Bland den andre sjokoladekremen med oransje konditorfarge. Ha begge over i hver sin sprøytepose.\n" +
            "\n" +
            "9. Sprøyt den oransje kremen med en dråpetipp (str. 103) på dine cupcakes. Sprøyt to striper mot venstre og to mot høyre - og avslutt med en på midten for å få illusjonen av et rundt gresskar. Avslutt med grønn konditorfarge på toppen.");

    List<String> menu1Dishes = new ArrayList<>();
    menu1Dishes.add("Laksefilet med saltkokte poteter");
    menu1Dishes.add("Frisk salat med appelsindressing");
    menu1Dishes.add("Gresskarcupcakes");
    menus.addMenu("Meny 1", menu1Dishes);

    List<String> menu2Dishes = new ArrayList<>();
    menu2Dishes.add("Spicy vegetar tostadas");
    menu2Dishes.add("Yoghurtbrød med svinesnadder");
    menu2Dishes.add("Heksegryte til Halloween");
    menus.addMenu("Meny 2", menu2Dishes);


    List<Dish> dishesOfType = menus.getDishesOfType("hovedrett");
    System.out.println("hovedretter:");
    dishesOfType.forEach(dish -> printDish(dish));

    List<List<Dish>> menusInPriceRange = menus.getMenusInPriceRange(425, 475);
    System.out.println("\nMenyer mellom 425 kr og 475 kr: ");
    menusInPriceRange.forEach(menu -> menu.forEach(dish -> printDish(dish)));
  }
}

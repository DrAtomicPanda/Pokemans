import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * @author Daniel
 * This class is a way in java to either search for a pokemon using a different attrubites of pokemon, 
 * Play a game to narrow down what pokemon you are thinking of, or figure out different things about 
 * Pokemon using their Pokedex number. Its all made in good fun for a Java project for CS143.
 * If you want more information about these pokemon check out the following for resources.
 * @see https://bulbapedia.bulbagarden.net/wiki/List_of_Pok%C3%A9mon_by_National_Pok%C3%A9dex_number
 * @see https://pokemondb.net/pokedex/national
 * @see https://www.pokemon.com/us/pokedex
 */
public class Pokemans {
    /**
     * This is all of the sets, maps, and scanners needed for this program to
     * function.
     */
    private static HashSet<String> pokesearch = new HashSet<>();
    private static HashSet<String> pokemans = new HashSet<>();
    private static HashSet<String> gen1 = new HashSet<>();
    private static HashSet<String> gen2 = new HashSet<>();
    private static HashSet<String> gen3 = new HashSet<>();
    private static HashSet<String> gen4 = new HashSet<>();
    private static HashSet<String> gen5 = new HashSet<>();
    private static HashSet<String> gen6 = new HashSet<>();
    private static HashSet<String> gen7 = new HashSet<>();
    private static HashSet<String> gen8 = new HashSet<>();
    private static HashSet<String> gen9 = new HashSet<>();
    private static HashSet<String> fire = new HashSet<>();
    private static HashSet<String> water = new HashSet<>();
    private static HashSet<String> normal = new HashSet<>();
    private static HashSet<String> steel = new HashSet<>();
    private static HashSet<String> fairy = new HashSet<>();
    private static HashSet<String> grass = new HashSet<>();
    private static HashSet<String> ground = new HashSet<>();
    private static HashSet<String> dark = new HashSet<>();
    private static HashSet<String> electric = new HashSet<>();
    private static HashSet<String> ice = new HashSet<>();
    private static HashSet<String> ghost = new HashSet<>();
    private static HashSet<String> bug = new HashSet<>();
    private static HashSet<String> flying = new HashSet<>();
    private static HashSet<String> poison = new HashSet<>();
    private static HashSet<String> fighting = new HashSet<>();
    private static HashSet<String> dragon = new HashSet<>();
    private static HashSet<String> rock = new HashSet<>();
    private static HashSet<String> psychic = new HashSet<>();
    private static HashSet<String> singleType = new HashSet<>();
    private static HashSet<String> dualType = new HashSet<>();
    private static HashSet<String> hasHide = new HashSet<>();
    private static HashSet<String> hasNoHide = new HashSet<>();
    private static HashSet<String> lessthan20lb = new HashSet<>();
    private static HashSet<String> lessthan45lb = new HashSet<>();
    private static HashSet<String> lessthan90lb = new HashSet<>();
    private static HashSet<String> lessthan200lb = new HashSet<>();
    private static HashSet<String> lbsbiggerthan200 = new HashSet<>();
    private static HashSet<String> lessthan2ft = new HashSet<>();
    private static HashSet<String> ft2andless4ft = new HashSet<>();
    private static HashSet<String> ft4andless6ft = new HashSet<>();
    private static HashSet<String> starter = new HashSet<>();
    private static HashSet<String> red = new HashSet<>();
    private static HashSet<String> blue = new HashSet<>();
    private static HashSet<String> black = new HashSet<>();
    private static HashSet<String> grey = new HashSet<>();
    private static HashSet<String> green = new HashSet<>();
    private static HashSet<String> brown = new HashSet<>();
    private static HashSet<String> yellow = new HashSet<>();
    private static HashSet<String> pink = new HashSet<>();
    private static HashSet<String> purple = new HashSet<>();
    private static HashSet<String> white = new HashSet<>();
    private static HashSet<String> ft6andgreater = new HashSet<>();
    private static HashSet<String> basicdoesevolve = new HashSet<>();
    private static HashSet<String> basicdoesntevolve = new HashSet<>();
    private static HashSet<String> firstevolveandstage1 = new HashSet<>();
    private static HashSet<String> bird = new HashSet<>();
    private static HashSet<String> secondevolve = new HashSet<>();
    private static TreeMap<String, String> pokedex = new TreeMap<>();
    private static TreeMap<String, String> pokedexnr = new TreeMap<>();
    private static boolean dualtyping = false;
    private static boolean flag = false;
    private static Scanner console = new Scanner(System.in);

    /**
     * This is the main method for the Pokemans java file used to make this program
     * function.
     * 
     * @param args A string array required for the old main method of java.
     * @throws IOException An exception needed because of the use of streams within
     *                     one of the methods it calls.
     */
    public static void main(String[] args) throws IOException {
        initdatabase();
        pokeInterface();
        System.out.println("Hope this program was able to do all the things you needed for your Poke Journey");
    }

    /**
     * This is the method that handles filling up all the sets and maps with their
     * correct pokemon information.
     * 
     * @throws IOException This exception is needed just in case the stream can not
     *                     find the file when attempting to fill up the sets.
     */
    public static void initdatabase() throws IOException {
        File name = new File("Pokedata/Pokemansnames.txt");
        File valuing = new File("Pokedata/Pokedexmapinfo.txt");
        Scanner keys = new Scanner(name);
        Scanner values = new Scanner(valuing);
        while (keys.hasNextLine()) {
            pokedex.put(keys.nextLine().toLowerCase(), values.nextLine());
        }
        name = new File("Pokedata/ListofNrs.txt");
        values = new Scanner(valuing);
        keys = new Scanner(name);
        while (keys.hasNextLine()) {
            pokedexnr.put(keys.nextLine(), values.nextLine());
        }
        values.close();
        keys.close();
        Files.lines(Paths.get("Pokedata/Pokemansnames.txt")).forEach(pokemans::add);
        Files.lines(Paths.get("Pokedata/Gen1.txt")).forEach(gen1::add);
        Files.lines(Paths.get("Pokedata/Gen2.txt")).forEach(gen2::add);
        Files.lines(Paths.get("Pokedata/Gen3.txt")).forEach(gen3::add);
        Files.lines(Paths.get("Pokedata/Gen4.txt")).forEach(gen4::add);
        Files.lines(Paths.get("Pokedata/Gen5.txt")).forEach(gen5::add);
        Files.lines(Paths.get("Pokedata/Gen6.txt")).forEach(gen6::add);
        Files.lines(Paths.get("Pokedata/Gen7.txt")).forEach(gen7::add);
        Files.lines(Paths.get("Pokedata/Gen8.txt")).forEach(gen8::add);
        Files.lines(Paths.get("Pokedata/Gen9.txt")).forEach(gen9::add);
        Files.lines(Paths.get("Pokedata/Fire.txt")).forEach(fire::add);
        Files.lines(Paths.get("Pokedata/Water.txt")).forEach(water::add);
        Files.lines(Paths.get("Pokedata/Grass.txt")).forEach(grass::add);
        Files.lines(Paths.get("Pokedata/Ground.txt")).forEach(ground::add);
        Files.lines(Paths.get("Pokedata/Psychic.txt")).forEach(psychic::add);
        Files.lines(Paths.get("Pokedata/Fairy.txt")).forEach(fairy::add);
        Files.lines(Paths.get("Pokedata/Flying.txt")).forEach(flying::add);
        Files.lines(Paths.get("Pokedata/Ice.txt")).forEach(ice::add);
        Files.lines(Paths.get("Pokedata/Fighting.txt")).forEach(fighting::add);
        Files.lines(Paths.get("Pokedata/Dragon.txt")).forEach(dragon::add);
        Files.lines(Paths.get("Pokedata/Ghost.txt")).forEach(ghost::add);
        Files.lines(Paths.get("Pokedata/Dark.txt")).forEach(dark::add);
        Files.lines(Paths.get("Pokedata/Poison.txt")).forEach(poison::add);
        Files.lines(Paths.get("Pokedata/Steel.txt")).forEach(steel::add);
        Files.lines(Paths.get("Pokedata/Rock.txt")).forEach(rock::add);
        Files.lines(Paths.get("Pokedata/Electric.txt")).forEach(electric::add);
        Files.lines(Paths.get("Pokedata/Bug.txt")).forEach(bug::add);
        Files.lines(Paths.get("Pokedata/Normal.txt")).forEach(normal::add);
        Files.lines(Paths.get("Pokedata/0lessthan20.txt")).forEach(lessthan20lb::add);
        Files.lines(Paths.get("Pokedata/2ftlessthan4ft.txt")).forEach(ft2andless4ft::add);
        Files.lines(Paths.get("Pokedata/4ftlessthan6ft.txt")).forEach(ft4andless6ft::add);
        Files.lines(Paths.get("Pokedata/20lessthan45.txt")).forEach(lessthan45lb::add);
        Files.lines(Paths.get("Pokedata/45lessthan90.txt")).forEach(lessthan90lb::add);
        Files.lines(Paths.get("Pokedata/90lessthan200.txt")).forEach(lessthan200lb::add);
        Files.lines(Paths.get("Pokedata/200orgreater.txt")).forEach(lbsbiggerthan200::add);
        Files.lines(Paths.get("Pokedata/greaterthan6ft.txt")).forEach(ft6andgreater::add);
        Files.lines(Paths.get("Pokedata/HasHiddenabil.txt")).forEach(hasHide::add);
        Files.lines(Paths.get("Pokedata/HasNoHiddenAbil.txt")).forEach(hasNoHide::add);
        Files.lines(Paths.get("Pokedata/Lessthan2ft.txt")).forEach(lessthan2ft::add);
        Files.lines(Paths.get("Pokedata/Singletype.txt")).forEach(singleType::add);
        Files.lines(Paths.get("Pokedata/Starter.txt")).forEach(starter::add);
        Files.lines(Paths.get("Pokedata/Yellow.txt")).forEach(yellow::add);
        Files.lines(Paths.get("Pokedata/Black.txt")).forEach(black::add);
        Files.lines(Paths.get("Pokedata/Blue.txt")).forEach(blue::add);
        Files.lines(Paths.get("Pokedata/Brown.txt")).forEach(brown::add);
        Files.lines(Paths.get("Pokedata/Gray.txt")).forEach(grey::add);
        Files.lines(Paths.get("Pokedata/Green.txt")).forEach(green::add);
        Files.lines(Paths.get("Pokedata/Pink.txt")).forEach(pink::add);
        Files.lines(Paths.get("Pokedata/Purple.txt")).forEach(purple::add);
        Files.lines(Paths.get("Pokedata/Red.txt")).forEach(red::add);
        Files.lines(Paths.get("Pokedata/White.txt")).forEach(white::add);
        Files.lines(Paths.get("Pokedata/Dualtype.txt")).forEach(dualType::add);
        Files.lines(Paths.get("Pokedata/basicdoesevol.txt")).forEach(basicdoesevolve::add);
        Files.lines(Paths.get("Pokedata/doesnotevolve.txt")).forEach(basicdoesntevolve::add);
        Files.lines(Paths.get("Pokedata/Firstevolvedandstage1.txt")).forEach(firstevolveandstage1::add);
        Files.lines(Paths.get("Pokedata/secondevolved.txt")).forEach(secondevolve::add);
        Files.lines(Paths.get("Pokedata/bird.txt")).forEach(bird::add);
    }

    /**
     * This is the method that hold the logic for reading the maps and takes in the
     * keyboard input.
     */
    public static void pokeInterface() {
        boolean leaveloop = false;
        while (!leaveloop) {
            System.out.println("What pokemon would you like to know more about?");
            String wanttoknow = console.nextLine();
            if (pokedex.containsKey(wanttoknow.toLowerCase())) {
                System.out.println(pokedex.get(wanttoknow.toLowerCase()));
            }
            if (pokedexnr.containsKey(wanttoknow)) {
                System.out.println(pokedexnr.get(wanttoknow));
            }
            if (wanttoknow.toLowerCase().equals("leave")) {
                leaveloop = true;
                break;
            }
            if (wanttoknow.toLowerCase().equals("game")) {
                game();
            }
            if (wanttoknow.toLowerCase().equals("all of them")) {
                System.out.println("Are you sure?");
                wanttoknow = console.nextLine();
                if (wanttoknow.toLowerCase().equals("yes")) {
                    System.out.println("Welp you asked for this");
                    pokedex.entrySet().forEach(System.out::println);
                }
            }
        }
    }

    /**
     * This is the game method that handles all the logic needed to narrow down the
     * pokemon you are thinking of to the best of its ability.
     */
    public static void game() {
        int questionnr = 0;
        System.out.println("Do you have a pokemon in mind?");
        String answers = console.nextLine();
        if (answers.toLowerCase().equals("no")) {
            System.out.println(
                    "Well cant play a game if you dont know what you want me to guess\nI'll send you back give you the pokedex for time to think");
            return;
        }
        System.out.println("Well thats not a no so here we go");
        while (questionnr != 8) {
            if (questionnr == 0) {
                System.out.println("What generation is your pokemon from?");
                answers = console.nextLine();
                switch (answers.toLowerCase()) {
                    case "gen1":
                        pokesearch.addAll(gen1);
                        questionnr++;
                        break;
                    case "gen2":
                        pokesearch.addAll(gen2);
                        questionnr++;
                        break;
                    case "gen3":
                        pokesearch.addAll(gen3);
                        questionnr++;
                        break;
                    case "gen4":
                        pokesearch.addAll(gen4);
                        questionnr++;
                        break;
                    case "gen5":
                        pokesearch.addAll(gen5);
                        questionnr++;
                        break;
                    case "gen6":
                        pokesearch.addAll(gen6);
                        questionnr++;
                        break;
                    case "gen7":
                        pokesearch.addAll(gen7);
                        questionnr++;
                        break;
                    case "gen8":
                        pokesearch.addAll(gen8);
                        questionnr++;
                        break;
                    case "gen9":
                        pokesearch.addAll(gen9);
                        questionnr++;
                        break;
                    case "leave":
                        return;
                    default:
                        System.out.println("Please enter a proper generation in gen# form");
                        continue;
                }
            }
            if (questionnr <= 1) {
                typing(pokesearch);
                if (dualtyping) {
                    typing(pokesearch);
                    dualtyping = false;
                    flag = false;
                }
                flag = false;
                questionnr++;
            }
            if (pokesearch.size() <= 1)
                break;
            if (questionnr == 2) {
                while (questionnr == 2) {
                    System.out.println("How tall is your pokemon?");
                    answers = console.nextLine();
                    switch (answers.toLowerCase()) {
                        case "leave":
                            return;
                        case "0ft<2ft":
                            pokesearch.retainAll(lessthan2ft);
                            questionnr++;
                            break;
                        case "2ft<4ft":
                            pokesearch.retainAll(ft2andless4ft);
                            questionnr++;
                            break;
                        case "4ft<6ft":
                            pokesearch.retainAll(ft4andless6ft);
                            questionnr++;
                            break;
                        case "6ft<":
                            pokesearch.retainAll(ft6andgreater);
                            questionnr++;
                            break;
                        case "meetsreq":
                            meetsthereq(pokesearch);
                            continue;
                        default:
                            System.out.println("Please enter either 0ft<2ft,2ft<4ft,4ft<6ft,6ft<");
                            continue;
                    }
                }

            }
            if (pokesearch.size() <= 1)
                break;
            if (questionnr == 3) {
                while (questionnr == 3) {
                    System.out.println("How much does your pokemon weigh?");
                    answers = console.nextLine();
                    switch (answers.toLowerCase()) {
                        case "leave":
                            return;
                        case "0lbs<20lbs":
                            pokesearch.retainAll(lessthan20lb);
                            questionnr++;
                            break;
                        case "20lbs<45lbs":
                            pokesearch.retainAll(lessthan45lb);
                            questionnr++;
                            break;
                        case "45lbs<90lbs":
                            pokesearch.retainAll(lessthan90lb);
                            questionnr++;
                            break;
                        case "90lbs<200lbs":
                            pokesearch.retainAll(lessthan200lb);
                            questionnr++;
                            break;
                        case "200lbs<":
                            pokesearch.retainAll(lbsbiggerthan200);
                            questionnr++;
                            break;
                        case "meetsreq":
                            meetsthereq(pokesearch);
                            continue;
                        default:
                            System.out
                                    .println(
                                            "Please enter either 0lbs<20lbs,20lbs<45lbs,45lbs<90lbs,90lbs<200lbs,<200lbs");
                            continue;
                    }
                }
            }
            if (pokesearch.size() <= 1)
                break;
            if (questionnr == 4) {
                while (questionnr == 4) {
                    System.out.println("Does your pokemon have a hidden ability?");
                    answers = console.nextLine();
                    switch (answers.toLowerCase()) {
                        case "leave":
                            return;
                        case "yes":
                            pokesearch.retainAll(hasHide);
                            questionnr++;
                            break;
                        case "no":
                            pokesearch.retainAll(hasNoHide);
                            questionnr++;
                            break;
                        case "meetsreq":
                            meetsthereq(pokesearch);
                            continue;
                        default:
                            System.out.println("Please enter yes or no.");
                    }
                }
            }
            if (pokesearch.size() <= 1)
                break;
            if (questionnr == 5) {
                while (questionnr == 5) {
                    System.out.println("Is your pokemon a starter pokemon?");
                    answers = console.nextLine();
                    switch (answers.toLowerCase()) {
                        case "leave":
                            return;
                        case "yes":
                            pokesearch.retainAll(starter);
                            questionnr++;
                            break;
                        case "no":
                            pokesearch.removeAll(starter);
                            questionnr++;
                            break;
                        case "meetsreq":
                            meetsthereq(pokesearch);
                            continue;
                        default:
                            System.out.println("Please enter yes or no.");
                    }
                }
            }
            if (pokesearch.size() <= 1)
                break;
            if (questionnr == 6) {
                while (questionnr == 6) {
                    System.out.println("What is the main color on your pokemon?");
                    answers = console.nextLine();
                    switch (answers.toLowerCase()) {
                        case "leave":
                            return;
                        case "red":
                            pokesearch.retainAll(red);
                            questionnr++;
                            break;
                        case "yellow":
                            pokesearch.retainAll(yellow);
                            questionnr++;
                            break;
                        case "black":
                            pokesearch.retainAll(black);
                            questionnr++;
                            break;
                        case "blue":
                            pokesearch.retainAll(blue);
                            questionnr++;
                            break;
                        case "brown":
                            pokesearch.retainAll(brown);
                            questionnr++;
                            break;
                        case "grey":
                        case "gray":
                            pokesearch.retainAll(grey);
                            questionnr++;
                            break;
                        case "green":
                            pokesearch.retainAll(green);
                            questionnr++;
                            break;
                        case "pink":
                            pokesearch.retainAll(pink);
                            questionnr++;
                            break;
                        case "purple":
                            pokesearch.retainAll(purple);
                            questionnr++;
                            break;
                        case "white":
                            pokesearch.retainAll(white);
                            questionnr++;
                            break;
                        case "meetsreq":
                            meetsthereq(pokesearch);
                            continue;
                        default:
                            System.out
                                    .println(
                                            "Please enter one of the following colors: Yellow,Black,Blue,Brown,Grey,Green,Pink,Purple,Red,White.");
                            continue;
                    }
                }
            }
            if (pokesearch.size() <= 1)
                break;
            if (questionnr == 7) {
                while (questionnr == 7) {
                    System.out.println(
                            "Is your pokemon basic and does evolve, basic and doesnt evolve, First evolution, or Second evolution?");
                    answers = console.nextLine();
                    switch (answers.toLowerCase()) {
                        case "leave":
                            return;
                        case "basic and evolves":
                            pokesearch.retainAll(basicdoesevolve);
                            questionnr++;
                            break;
                        case "first evolution":
                            pokesearch.retainAll(firstevolveandstage1);
                            questionnr++;
                            break;
                        case "Second evolution":
                            pokesearch.retainAll(secondevolve);
                            questionnr++;
                            break;
                        case "basic and doesnt evolve":
                            pokesearch.retainAll(basicdoesntevolve);
                            questionnr++;
                            break;
                        case "meetsreq":
                            meetsthereq(pokesearch);
                            continue;
                        default:
                            System.out.println(
                                    "Please enter either \"basic and evolves\",\"basic and doesnt evolve\", \"First evolution\", or \"Second evolution\". ");
                    }
                }
            }
        }
        if (pokesearch.size() > 1)
            System.out.println(
                    "This game is currently not a sure fire way to narrow down your pokemon yet but it should be one of these : ");
        if (pokesearch.size() == 0)
            System.out.println("You must have messed up your stats somewhere double check and try again");
        System.out.println(pokesearch);
    }

    private static void typing(HashSet<String> searching) {
        boolean flag2 = false;
        String answers = "";
        while (!flag) {
            if (!dualtyping) {
                System.out.println("Is your Pokemon single or dual typed?");
                answers = console.nextLine();
            } else {
                flag = true;
                break;
            }
            switch (answers.toLowerCase()) {
                case "leave":
                    return;
                case "dual":
                    searching.retainAll(dualType);
                    dualtyping = true;
                    flag = true;
                    break;
                case "single":
                    searching.retainAll(singleType);
                    flag = true;
                    break;
                case "meetsreq":
                    meetsthereq(searching);
                    continue;
                default:
                    System.out.println("Please enter either single or dual.");
            }
        }
        flag2 = false;
        while (!flag2) {
            System.out.println("What is one or the only typing?");
            answers = console.nextLine();
            switch (answers.toLowerCase()) {
                case "leave":
                    return;
                case "fire":
                    flag2 = true;
                    searching.retainAll(fire);
                    break;
                case "water":
                    flag2 = true;
                    searching.retainAll(water);
                    break;
                case "grass":
                    flag2 = true;
                    searching.retainAll(grass);
                    break;
                case "ground":
                    flag2 = true;
                    searching.retainAll(ground);
                    break;
                case "steel":
                    flag2 = true;
                    searching.retainAll(steel);
                    break;
                case "fairy":
                    flag2 = true;
                    searching.retainAll(fairy);
                    break;
                case "dragon":
                    flag2 = true;
                    searching.retainAll(dragon);
                    break;
                case "rock":
                    flag2 = true;
                    searching.retainAll(rock);
                    break;
                case "ghost":
                    flag2 = true;
                    searching.retainAll(ghost);
                    break;
                case "psychic":
                    flag2 = true;
                    searching.retainAll(psychic);
                    break;
                case "fighting":
                    flag2 = true;
                    searching.retainAll(fighting);
                    break;
                case "bug":
                    flag2 = true;
                    searching.retainAll(bug);
                    break;
                case "normal":
                    flag2 = true;
                    searching.retainAll(normal);
                    break;
                case "dark":
                    flag2 = true;
                    searching.retainAll(dark);
                    break;
                case "flying":
                    flag2 = true;
                    searching.retainAll(flying);
                    break;
                case "poison":
                    flag2 = true;
                    searching.retainAll(poison);
                    break;
                case "electric":
                    flag2 = true;
                    searching.retainAll(electric);
                    break;
                case "ice":
                    flag2 = true;
                    searching.retainAll(ice);
                    break;
                case "bird":
                    flag2 = true;
                    searching.retainAll(bird);
                    break;
                case "meetsreq":
                    meetsthereq(searching);
                    continue;
                case "default":
                    System.out.println(
                            "Please enter one of the 18 different typings that are within pokemon example fire or grass");
            }

        }
        return;
    }

    private static void meetsthereq(HashSet<String> whatsinhere) {
        System.out.println(whatsinhere);
    }
}

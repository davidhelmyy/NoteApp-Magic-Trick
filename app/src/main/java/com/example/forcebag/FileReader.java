package com.example.forcebag;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Environment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    private static Note readList(String FileName)
    {
      List<String> list=new ArrayList<>();



      //  File sdCard= (File) Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        File sdCard= GlobalContext.getContext().getFilesDir();
        File file=new File(sdCard,FileName);

        StringBuilder text=new StringBuilder();

        try {


            BufferedReader br = new BufferedReader(new java.io.FileReader(file));
            String temp = new String();
            while ((temp = br.readLine()) != null) {

                String tempString = temp;
                list.add(tempString);
            }

        }catch (Exception e )
        {

        }



            return new Note(list);
    }


    public static List<Note> ReadAllNotes(String filename)
    {
        List <String>listFileNames=new ArrayList();
        List<Note> listNote=new ArrayList<>();

        //File sdCard= (File) Environment.getDataDirectory();
        File sdCard= GlobalContext.getContext().getFilesDir();
        File file=new File(sdCard,filename);


        try{


            BufferedReader br = new BufferedReader(new java.io.FileReader(file));
            String temp=new String();
            while ((temp=br.readLine())!=null)

            {

                String tempString=temp;
                listFileNames.add(tempString);
            }


            for (int i=0;i<listFileNames.size();i++)
                listNote.add(readList(listFileNames.get(i)));




        }catch (Exception e)
        {

        }




            return listNote ;


    }

    //incase of errors in reading files

    public static Note InitMovieList()
    {
    	List<String> temp=new ArrayList<>();
    	temp.add("Top 100 Movies");
temp.add("Avengers: Endgame (2019)");
temp.add("Star Wars: Episode VII - The Force Awakens (2015)");
temp.add("Avatar (2009)");
temp.add("Black Panther (2018)");
temp.add("Avengers: Infinity War (2018)");
temp.add("Titanic (1997)");
temp.add("Jurassic World (2015)");
temp.add("Marvel's The Avengers (2012)");
temp.add("Star Wars: Episode VIII - The Last Jedi (2017)");
temp.add("Incredibles 2 (2018)");
temp.add("The Dark Knight (2008)");
temp.add("Rogue One: A Star Wars Story (2016)");
temp.add("Beauty and the Beast (2017)");
temp.add("Finding Dory (2016)");
temp.add("Star Wars: Episode I - The Phantom Menace (1999)");
temp.add(" Star Wars: Episode IV - A New Hope (1977)");
temp.add("Avengers: Age of Ultron (2015)");
temp.add("The Dark Knight Rises (2012)");
temp.add("Shrek 2 (2004)");
temp.add(" E. T. The Extra-Terrestrial (1982)");
temp.add("Captain Marvel (2019)");
temp.add("The Hunger Games: Catching Fire (2013)");
temp.add("Pirates of the Caribbean: Dead Man's Chest (2006)");
temp.add("The Lion King (1994)");
temp.add("Jurassic World: Fallen Kingdom (2018)");
temp.add("Toy Story 3 (2010)");
temp.add("Wonder Woman (2017)");
temp.add("Iron Man 3 (2013)");
temp.add("Captain America: Civil War (2016)");
temp.add("The Hunger Games (2012)");
temp.add("Toy Story 4 (2019)");
temp.add("Jumanji: Welcome to the Jungle (2017)");
temp.add("The Lion King (2019)");
temp.add("Spider-Man (2002)");
temp.add("Jurassic Park (1993)");
temp.add("Transformers: Revenge of the Fallen (2009)");
temp.add("Frozen (2013)");
temp.add("Guardians of the Galaxy Vol. 2 (2017)");
temp.add("Harry Potter and the Deathly Hallows, Part 2 (2011)");
temp.add("Finding Nemo (2003)");
temp.add("Star Wars: Episode III - Revenge of the Sith (2005)");
temp.add("The Lord of the Rings: The Return of the King (2003)");
temp.add("Spider-Man 2 (2004)");
temp.add("The Passion of the Christ (2004)");
temp.add("The Secret Life of Pets (2016)");
temp.add("Despicable Me 2 (2013)");
temp.add("The Jungle Book (2016)");
temp.add("Deadpool (2016)");
temp.add("Inside Out (2015)");
temp.add("Spider-Man: Far from Home (2019)");
temp.add("Furious 7 (2015)");
temp.add("Transformers: Dark of the Moon (2011)");
temp.add("American Sniper (2014)");
temp.add("Aladdin (2019)");
temp.add("The Lord of the Rings: The Two Towers (2002)");
temp.add("Zootopia (2016)");
temp.add("The Hunger Games: Mockingjay - Part 1 (2014)");
temp.add("Spider-Man 3 (2007)");
temp.add("Minions (2015)");
temp.add("Aquaman (2018)");
temp.add("Spider-Man: Homecoming (2017)");
temp.add("Alice in Wonderland (2010)");
temp.add("Guardians of the Galaxy (2014)");
temp.add("Forrest Gump (1994)");
temp.add("Batman v Superman: Dawn of Justice (2016)");
temp.add("It (2017) ");
temp.add("Suicide Squad (2016)");
temp.add("Deadpool 2 (2018)");
temp.add("Shrek the Third (2007)");
temp.add("Transformers (2007)");
temp.add("Iron Man (2008)");
temp.add("Harry Potter and the Sorcerer's Stone (2001)");
temp.add("Indiana Jones and the Kingdom of the Crystal Skull (2008)");
temp.add("The Lord of the Rings: The Fellowship of the Ring (2001)");
temp.add("Thor: Ragnarok (2017)");
temp.add("Iron Man 2 (2010)");
temp.add("Star Wars: Episode II - Attack of the Clones (2002)");
temp.add("Pirates of the Caribbean: At World's End (2007)");
temp.add("Star Wars: Episode VI - Return of the Jedi (1983)");
temp.add("Independence Day (1996)");
temp.add("Pirates of the Caribbean: The Curse of the Black Pearl (2003)");
temp.add("Skyfall (2012)");
temp.add("The Hobbit: An Unexpected Journey (2012)");
temp.add("Harry Potter and the Half-Blood Prince (2009)");
temp.add("The Twilight Saga: Eclipse (2010)");
temp.add("The Twilight Saga: New Moon (2009)");
temp.add("Harry Potter and the Deathly Hallows, Part 1 (2010)");
temp.add("The Sixth Sense (1999)");
temp.add("Up (2009)");
temp.add("Inception (2010)");
temp.add("The Twilight Saga: Breaking Dawn, Part 2 (2012)");
temp.add("Harry Potter and the Order of the Phoenix (2007)");
temp.add("The Chronicles of Narnia: The Lion, the Witch and the Wardrobe (2005)");
temp.add("Man of Steel (2013)");
temp.add("Star Wars: Episode V - The Empire Strikes Back (1980)");
temp.add("Harry Potter and the Goblet of Fire (2005)");
temp.add("Monsters, Inc. (2001)");
temp.add("Home Alone (1990)");
temp.add("The Hunger Games: Mockingjay - Part 2 (2015)");
temp.add("The Matrix Reloaded (2003)");




		return new Note(temp);
    }

    public static Note InitActorsList()
    {
List<String> temp=new ArrayList<>();
temp.add("Top 100 Celebrities");
temp.add("Vin Desil");
temp.add("Mel Gibson");
temp.add("Elvis Presley");
temp.add("Martin Luther King");
temp.add("Muhammed Ali");
temp.add("Calvin Harris");
temp.add("Ellen Degeneres");
temp.add("Oprah Winfrey");
temp.add("Christian Bale");
temp.add("Justin Timberlake");
temp.add("Harry Styles");
temp.add("Rihanna");
temp.add("Abraham Lincoln");
temp.add("Michael Jordan");
temp.add("Ed Sheeran");
temp.add("Steve Jobs");
temp.add("Justin Bieber");
temp.add("Daniel Craig");
temp.add("Albert Einstein");
temp.add("Bruce Willis");
temp.add("Harry Houdini");
temp.add("Lady Gaga");
temp.add("Russell Crowe");
temp.add("The Queen");
temp.add("Jack Nicholson");
temp.add("David Beckham");
temp.add("Dwayne Johnson");
temp.add("Adele");
temp.add("George Clooney");
temp.add("Robert Pattinson");
temp.add("John F. Kennedy");
temp.add("Marilyn Monroe");
temp.add("Tom Holland");
temp.add("Angelina Jolie");
temp.add("Prince");
temp.add("kanye West");
temp.add("Johnny Depp");
temp.add("Donald Trump");
temp.add("Prince William");
temp.add("Meryl Streep");
temp.add("George Michael");
temp.add("Ariana Grande");
temp.add("Nicole Scherzinger");
temp.add("Margot Robbie");
temp.add("Tom Cruise");
temp.add("Sylvester Stallone");
temp.add("Tom Hanks");
temp.add("Harrison Ford");
temp.add("Nelson Mandela");
temp.add("Richard Branson");
temp.add("Benedict Cumberbatch");
temp.add("Selena Gomez");
temp.add("Daniel Radcliffe");
temp.add("Jennifer Lopez");
temp.add("JK Rowling");
temp.add("Barack Obama");
temp.add("Roger Federer");
temp.add("Ben Affleck");
temp.add("Jennifer Lawrence");
temp.add("Madonna");
temp.add("Usain Bolt");
temp.add("James Corden");
temp.add("Michael Jackson");
temp.add("Beyonce");
temp.add("Michael Buble");
temp.add("Prince Harry");
temp.add("Jimmy Fallon");
temp.add("Will Smith");
temp.add("Kate Winslet");
temp.add("Simon Cowell");
temp.add("Matt Damon");
temp.add("Bruno Mars");
temp.add("Hugh Jackman");
temp.add("Zac Efron");
temp.add("Kim Kardashian");
temp.add("Ryan Reynolds");
temp.add("Drake");
temp.add("Katy Perry");
temp.add("Julia Roberts");
temp.add("Bill Gates");
temp.add("Emma Stone");
temp.add("Leonardo DiCaprio");
temp.add("Ryan Gosling");
temp.add("Miley Cyrus");
temp.add("Tina Turner");
temp.add("Winston Churchill");
temp.add("Britney Spears");
temp.add("Jay-Z");
temp.add("Walt Disney");
temp.add("Judi Dench");
temp.add("Frank Sinatra");
temp.add("Taylor Swift");
temp.add("Steven Spielberg");
temp.add("Brad Pitt");
temp.add("Sia");
temp.add("John Legend");
temp.add("Denzel Washington");
temp.add("Tiger woods");
temp.add("Christopher Columbus");
temp.add("Shakespeare");


return new Note(temp);
    }


    public static Note InitNumbers()
    {
    	List<String> temp=new ArrayList<>();
temp.add("100 Random Number");
temp.add("28710382");
temp.add("29890533");
temp.add("30678668");
temp.add("74278587");
temp.add("85690433");
temp.add("32970200");
temp.add("59569288");
temp.add("39084524");
temp.add("19640820");
temp.add("57331589");
temp.add("48781070");
temp.add("51026093");
temp.add("72113798");
temp.add("52274362");
temp.add("36675204");
temp.add("17261024");
temp.add("63036138");
temp.add("15214427");
temp.add("34316475");
temp.add("11389870");
temp.add("13043239");
temp.add("94958531");
temp.add("18812583");
temp.add("62907334");
temp.add("29445405");
temp.add("17859705");
temp.add("68930717");
temp.add("42422645");
temp.add("46591307");
temp.add("58925517");
temp.add("20717018");
temp.add("14937619");
temp.add("42583552");
temp.add("44075882");
temp.add("70347293");
temp.add("62138188");
temp.add("55834230");
temp.add("26084026");
temp.add("63578219");
temp.add("64355725");
temp.add("14509264");
temp.add("84801191");
temp.add("97037670");
temp.add("46861253");
temp.add("36126700");
temp.add("17211535");
temp.add("41183137");
temp.add("48510094");
temp.add("13531824");
temp.add("65214976");
temp.add("68569411");
temp.add("54975347");
temp.add("18874753");
temp.add("56851706");
temp.add("65471627");
temp.add("92995539");
temp.add("16305567");
temp.add("85238919");
temp.add("24477756");
temp.add("26323244");
temp.add("30863590");
temp.add("15330217");
temp.add("93288707");
temp.add("72055852");
temp.add("81257758");
temp.add("24086221");
temp.add("98482468");
temp.add("10016399");
temp.add("76011718");
temp.add("87105913");
temp.add("65800239");
temp.add("25454079");
temp.add("93433738");
temp.add("51428912");
temp.add("33128405");
temp.add("43861510");
temp.add("62329029");
temp.add("62809378");
temp.add("76706265");
temp.add("70695758");
temp.add("68437671");
temp.add("64360980");
temp.add("85004390");
temp.add("51172582");
temp.add("54185499");
temp.add("23739707");
temp.add("46489527");
temp.add("32334903");
temp.add("87706339");
temp.add("87227922");
temp.add("37009512");
temp.add("73809248");
temp.add("68415899");
temp.add("92457578");
temp.add("39238767");
temp.add("86204106");
temp.add("33929772");
temp.add("57756941");
temp.add("17852728");
temp.add("11386628");
 
 return new Note(temp);
    }


    public static Note InitPlaces()

    {
    	List<String> temp=new ArrayList<>();
temp.add("100 Remarkable Place To Visit");
temp.add("Antarctica");
temp.add("London, England");
temp.add("Paris, France");
temp.add("New York, New York");
temp.add("San Francisco, California");
temp.add("Vatican City, Europe");
temp.add("Venice, Italy");
temp.add("Florence, Italy");
temp.add("Barcelona, Spain");
temp.add("Greek Islands, Greece");
temp.add("Grand Canyon, United States");
temp.add("Alps, Europe");
temp.add("Sagrada Família, Spain");
temp.add("Athens, Greece");
temp.add("Dublin, Ireland");
temp.add("Tuscany, Italy");
temp.add("Cyberspace");
temp.add("Acropolis, Greece");
temp.add("Coast Redwoods, California");
temp.add("Atlanta, Georgia");
temp.add("Hawaiian Islands, Hawaii");
temp.add("Lake District, England");
temp.add("Vancouver, Canada");
temp.add("Berlin, Germany");
temp.add("Big Sur, California");
temp.add("Library of Congress, Washington DC");
temp.add("Amalfi Coast, Italy");
temp.add("Hong Kong, China");
temp.add("Vermont, USA");
temp.add("Loire Valley, France");
temp.add("Istanbul, Turkey");
temp.add("Canadian Rockies");
temp.add("North Island, New Zealand");
temp.add("Pyramids, Egypt");
temp.add("Australian Outback");
temp.add("Tokyo, Japan");
temp.add("Great Wall, China");
temp.add("Norway's Coast");
temp.add("St. Petersburg, Russia");
temp.add("Mesa Verde, Colorado");
temp.add("Mexico City, Mexico");
temp.add("British Virgin Islands");
temp.add("Azure Coast, Turkey");
temp.add("Karnak, Egypt");
temp.add("Delhi, India");
temp.add("Jerusalem, Israel");
temp.add("Sahara Desert, Africa");
temp.add("Taj Mahal, India");
temp.add("Mount Rigi, Switzerland");
temp.add("Pacific Islands");
temp.add("Angkor, Cambodia");
temp.add("Piedmont Region, Virginia");
temp.add("Machu Picchu, Peru");
temp.add("Rio De Janeiro, Brazil");
temp.add("Terra Cotta Army, China");
temp.add("The Maritimes, Canada");
temp.add("Serengeti, Africa");
temp.add("Petra, Jordan");
temp.add("Danang to Hue, Vietnam");
temp.add("Amazon Forest");
temp.add("Molokai, Hawaii");
temp.add("Japanese Ryokan, Japan");
temp.add("Fatehpur Sikri, India");
temp.add("Sawtooth Mountains, Idaho");
temp.add("Montenegro, Balkans");
temp.add("Rif Mountains, Morocco");
temp.add("Osa Peninsula, Costa Rica");
temp.add("Asturias, Spain");
temp.add("Arnhem Land, Australia");
temp.add("Kerala, India");
temp.add("Boundary Waters, Minnesota");
temp.add("Galápagos Islands");
temp.add("Aleutian Islands, Alaska");
temp.add("Okavango Delta, Botswana");
temp.add("Gaspé Peninsula, Canada");
temp.add("Mayreau, St. Vincent");
temp.add("Mendoza, Argentina");
temp.add("Torres Del Paine, Chile");
temp.add("Salina, Italy");
temp.add("Seychelles, East Africa");
temp.add("Sagarmatha National Park");
temp.add("Cordillera Terraces, Philippines");
temp.add("Gobi Desert, China and Mongolia");
temp.add("Aitutaki, Cook Islands");
temp.add("Kuelap, Peru");
temp.add("Easter Island, Chile");
temp.add("Potala Palace, Tibet");
temp.add("Lake Baikal, Russia");
temp.add("Lord Howe Island, Australia");
temp.add("Bwindi Impenetrable Forest");
temp.add("Auyuittuq National Park");
temp.add("Samarkand and Bukhara");
temp.add("Venezuela's Tepuis");
temp.add("Madidi National Park, Bolivia");
temp.add("Papua New Guinea's Coral Reefs");
temp.add("South Georgia Island");
temp.add("Fernando De Noronha Archipelago");
temp.add("Quirimbas Archipelago, Mozambique");
temp.add("Leptis Magna, Libya");
temp.add("Yap's Outer Islands, Micronesia");
return new Note(temp);

    }

    public static Note InitGOT()
    {
    	List<String> temp=new ArrayList<>();
temp.add("GOT 100 Character");
temp.add("Sansa Stark");
temp.add("Catelyn Stark");
temp.add("Bronn");
temp.add("Septa Mordane");
temp.add("Lysa Arryn");
temp.add("Septa Unella");
temp.add("Drogon");
temp.add("Balon Greyjoy");
temp.add("Ros");
temp.add("Hodor");
temp.add("Qyburn");
temp.add("Peter Baelish");
temp.add("Brynden Tully");
temp.add("Loras Tyrell");
temp.add("Melisandre");
temp.add("Jorah Mormont");
temp.add("Viserys Targaryen");
temp.add("Thoros of Myr");
temp.add("Varys");
temp.add("Daenarys Targaryen");
temp.add("Lancel Lannister");
temp.add("Tormund Giantsbane");
temp.add("Tywin Lannister");
temp.add("Olenna Tyrell");
temp.add("Hoster Tully");
temp.add("Rhagarl");
temp.add("Brienne of Tarth");
temp.add("Margeary Tyrell");
temp.add("Howland Reed");
temp.add("Lyanna Mormont");
temp.add("Edmure Tully");
temp.add("Elia Martell");
temp.add("Gilly");
temp.add("Walder Frey");
temp.add("Talisa Stark");
temp.add("Theon Greyjoy");
temp.add("Obara Sand");
temp.add("Tyrion Lannister");
temp.add("Rhaegar Targaryen");
temp.add("Sandor Clegane ");
temp.add("Yara Greyjoy");
temp.add("Rickon Stark");
temp.add("Leaf");
temp.add("Robin Arryn");
temp.add("Stannis Baratheon");
temp.add("Renly Baratheon");
temp.add("Alliser Thorne");
temp.add("Beric Dondarrion");
temp.add("Missandei");
temp.add("Samwell Tarly");
temp.add("Viserion");
temp.add("Robb Stark");
temp.add("Cersei Lannister");
temp.add("Grand Measter Pycelle");
temp.add("Benjen Stark");
temp.add("Shireen Baratheon");
temp.add("Victarion Greyjoy");
temp.add("Doran Martell");
temp.add("Ned Stark");
temp.add("Aries Targaryen");
temp.add("Jojen Reed");
temp.add("The Night King");
temp.add("Randall Tarly");
temp.add("Maester Luwin");
temp.add("Tommen Barathoen");
temp.add("Bran Stark");
temp.add("Yohn Royce");
temp.add("Jon Snow");
temp.add("Mace Tyrell");
temp.add("Arya Stark");
temp.add("Jaime Lannister");
temp.add("Myrcella Baratheon");
temp.add("Osha");
temp.add("Jon Arryn");
temp.add("Oberyn Martell");
temp.add("Joffrey Baratheon");
temp.add("Lyanna Stark");
temp.add("Little Walder Frey");
temp.add("Old Nan");
temp.add("Grey worm");
temp.add("Gregor Clegane");
temp.add("Craster");
temp.add("Nymera Sand");
temp.add("Olly ");
temp.add("Grenn");
temp.add("Doloros Ed");
temp.add("Mance Rayder");
temp.add("Gendry Baratheon");
temp.add("Meera Reed");
temp.add("Elaria Sand");
temp.add("Ghost");
temp.add("Kevan Lannister");
temp.add("Euron Greyjoy");
temp.add("High Sparrow");
temp.add("Robert Baratheon");
temp.add("Tyene Sand");
temp.add("Tristane Martell");
temp.add("Jeor Mormont");
temp.add("Dickon Tarly");
temp.add("Little Sam");
return new Note(temp);

    }


    public static Note InitDogNames()
    {
    	List<String> temp=new ArrayList<>();
temp.add("Top Picked Dog Names");
temp.add("Simba");
temp.add("Alex");
temp.add("Harley");
temp.add("Diesel");
temp.add("Luna");
temp.add("Jackson");
temp.add("Jasmine");
temp.add("Lola");
temp.add("Bentley");
temp.add("Romeo");
temp.add("Copper");
temp.add("Tucker");
temp.add("Sadie");
temp.add("Scooter");
temp.add("Allie");
temp.add("Olive");
temp.add("Rusty");
temp.add("Cookie");
temp.add("Abby");
temp.add("Nala");
temp.add("Rocco");
temp.add("Nikki");
temp.add("Sandy");
temp.add("Roxie");
temp.add("Ollie");
temp.add("Oreo");
temp.add("Zoey");
temp.add("Tank");
temp.add("Minnie");
temp.add("Chico");
temp.add("Holly");
temp.add("Josie");
temp.add("Foster");
temp.add("Koda");
temp.add("Callie");
temp.add("Cash");
temp.add("Millie");
temp.add("Wrigley");
temp.add("Boomer");
temp.add("Bailey");
temp.add("Layla");
temp.add("Puppy");
temp.add("Lucky");
temp.add("Cocoa");
temp.add("Coco");
temp.add("Dexter");
temp.add("Bubba");
temp.add("Shadow");
temp.add("Jameson");
temp.add("Charlie");
temp.add("Willow");
temp.add("Frankie");
temp.add("Dodger");
temp.add("Cody");
temp.add("Thor");
temp.add("Chester");
temp.add("Gracie");
temp.add("Annie");
temp.add("Sherman");
temp.add("Zoe");
temp.add("Ginger");
temp.add("Gucci");
temp.add("Ace");
temp.add("Mercedes");
temp.add("Penelope");
temp.add("Izzy");
temp.add("Milo");
temp.add("Loki");
temp.add("Sassy");
temp.add("Katie");
temp.add("Bo");
temp.add("Mickey");
temp.add("Fiona");
temp.add("Polo");
temp.add("Maya");
temp.add("Rufus");
temp.add("Bear");
temp.add("Monkey");
temp.add("Dolce");
temp.add("Mocha");
temp.add("Lilly");
temp.add("Maverick");
temp.add("Ellie");
temp.add("Mimi");
temp.add("Sydney");
temp.add("Jasper");
temp.add("Lily");
temp.add("Jeter");
temp.add("Sparky");
temp.add("Penny");
temp.add("Trixie");
temp.add("Chase");
temp.add("Phoebe");
temp.add("Lacey");
temp.add("Baby");
temp.add("Prince");
temp.add("Kobe");
temp.add("Angel");
temp.add("Jake");
temp.add("Samson");
return new Note(temp);

    }



    public static Note InitSongs()
    {
        List<String> temp=new ArrayList<>();
        temp.add("Top 100 Song of 2018");
        temp.add("Havana - Camila Cabello Featuring Young Thug");
        temp.add("God’s Plan - Drake");
        temp.add("Perfect - Ed Sheeran");
        temp.add("Meant To Be - Bebe Rexha & Florida Georgia Line");
        temp.add("Rockstar - Post Malone Featuring 21 Savage");
        temp.add("Psycho - Post Malone Featuring Ty Dolla $ign");
        temp.add("I Like It - Cardi B, Bad Bunny & J Balvin");
        temp.add("The Middle - Zedd, Maren Morris & Grey");
        temp.add("In My Feelings - Drake");
        temp.add("Girls Like You - Maroon 5 Featuring Cardi B");
        temp.add("Nice For What - Drake");
        temp.add("Lucid Dreams - Juice WRLD");
        temp.add("Better Now - Post Malone");
        temp.add("Finesse - Bruno Mars & Cardi B");
        temp.add("Boo’d Up - Ella Mai");
        temp.add("New Rules - Dua Lipa");
        temp.add("Sad! - XXXTENTACION");
        temp.add("Never Be The Same - Camila Cabello");
        temp.add("Love Lies - Khalid & Normani");
        temp.add("No Tears Left To Cry - Ariana Grande");
        temp.add("Mine - Bazzi");
        temp.add("Thunder - Imagine Dragons");
        temp.add("Look Alive - BlocBoy JB Featuring Drake");
        temp.add("Delicate - Taylor Swift");
        temp.add("Yes Indeed - Lil Baby & Drake");
        temp.add("Friends - Marshmello & Anne-Marie");
        temp.add("Bad At Love - Halsey");
        temp.add("Taste - Tyga Featuring Offset");
        temp.add("Let You Down - NF");
        temp.add("No Limit - G-Eazy Featuring A$AP Rocky & Cardi B");
        temp.add("FEFE - 6ix9ine Featuring Nicki Minaj & Murda Beatz");
        temp.add("Tequila - Dan + Shay");
        temp.add("Feel It Still - Portugal. The Man");
        temp.add("MotorSport - Migos, Nicki Minaj & Cardi B");
        temp.add("I Like Me Better - Lauv");
        temp.add("Youngblood - 5 Seconds Of Summer");
        temp.add("Whatever It Takes - Imagine Dragons");
        temp.add("Ric Flair Drip - Offset & Metro Boomin");
        temp.add("I Fall Apart - Post Malone");
        temp.add("Pray For Me - The Weeknd & Kendrick Lamar");
        temp.add("Back To You - Selena Gomez");
        temp.add("Sicko Mode - Travis Scott");
        temp.add("Walk It Talk It - Migos Featuring Drake");
        temp.add("Gucci Gang - Lil Pump");
        temp.add("Him & I - G-Eazy & Halsey");
        temp.add("In My Blood - Shawn Mendes");
        temp.add("All The Stars - Kendrick Lamar & SZA");
        temp.add("Stir Fry - Migos");
        temp.add("Too Good At Goodbyes - Sam Smith");
        temp.add("Love. - Kendrick Lamar Featuring Zacari");
        temp.add("This Is America - Childish Gambino");
        temp.add("Nonstop - Drake");
        temp.add("Heaven - Kane Brown");
        temp.add("Bodak Yellow (Money Moves) - Cardi B");
        temp.add("Freaky Friday - Lil Dicky Featuring Chris Brown");
        temp.add("Gummo - 6ix9ine");
        temp.add("Plug Walk - Rich The Kid");
        temp.add("Wait - Maroon 5");
        temp.add("Be Careful - Cardi B");
        temp.add("Wolves - Selena Gomez X Marshmello");
        temp.add("Bartier Cardi - Cardi B Featuring 21 Savage");
        temp.add("God Is A Woman - Ariana Grande");
        temp.add("Big Bank - YG Featuring 2 Chainz");
        temp.add("Sorry Not Sorry - Demi Lovato");
        temp.add("How Long - Charlie Puth");
        temp.add("Lights Down Low - MAX Featuring gnash");
        temp.add("Young Dumb & Broke - Khalid");
        temp.add("One Kiss - Calvin Harris & Dua Lipa");
        temp.add("Natural - Imagine Dragons");
        temp.add("You Make It Easy - Jason Aldean");
        temp.add("Shape Of You - Ed Sheeran");
        temp.add("I Get The Bag - Gucci Mane Featuring Migos");
        temp.add("No Brainer - DJ Khaled Featuring Justin Bieber");
        temp.add("Plain Jane - A$AP Ferg Featuring Nicki Minaj");
        temp.add("Sky Walker - Miguel Featuring Travis Scott");
        temp.add("Marry Me - Thomas Rhett");
        temp.add("Eastside - Benny Blanco, Halsey & Khalid");
        temp.add("Call Out My Name - The Weeknd");
        temp.add("King’s Dead - Jay Rock, Kendrick Lamar, Future & James Blake");
        temp.add("Happier - Marshmello & Bastille");
        temp.add("Te Bote - Casper Magico, Nio Garcia, Darell");
        temp.add("Simple - Florida Georgia Line");
        temp.add("Lemon - N*E*R*D & Rihanna");
        temp.add("1-800-273-8255 - Logic Featuring Alessia Cara & Khalid");
        temp.add("Say Something - Justin Timberlake Featuring Chris Stapleton");
        temp.add("I’m Upset - Drake");
        temp.add("Get Along - Kenny Chesney");
        temp.add("Moonlight - XXXTENTACION");
        temp.add("What Lovers Do - Maroon 5 Featuring SZA");
        temp.add("X - Nicky Jam x J Balvin");
        temp.add("Outside Today - YoungBoy Never Broke Again");
        temp.add("Trip - Ella Mai");
        temp.add("Dura - Daddy Yankee");
        temp.add("Changes - XXXTENTACION");
        temp.add("Mercy - Brett Young");
        temp.add("One Number Away - Luke Combs");
        temp.add("Powerglide - Rae Sremmurd & Juicy J");
        temp.add("IDGAF - Dua Lipa");
        temp.add("Mi Gente - J Balvin & Willy William Featuring Beyonce");
        temp.add("Believer - Imagine Dragons");
        return new Note(temp);
    }



public static List<Note> InitLists()
{
	List<Note> temp=new ArrayList<>();
	temp.add(InitActorsList());
	temp.add(InitSongs());
	temp.add(InitMovieList());
	temp.add(InitPlaces());
	temp.add(InitGOT());
	temp.add(InitNumbers());
	temp.add(InitDogNames());

    return temp;
}



}

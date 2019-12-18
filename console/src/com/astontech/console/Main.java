package com.astontech.console;
import com.astontech.bo.*;
import com.astontech.bo.interfaces.Home;
import com.astontech.bo.interfaces.ILocation;
import com.astontech.bo.interfaces.IPerson;
import com.astontech.bo.interfaces.Site;
import common.helpers.MathHelper;
import common.helpers.StringHelper;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Lessons Stack:
        LessonPrinciples5LAB();
        //LessonLogger();
        //LessonDebugger();
        //LessonInterfaceTest();
        //LessonModuleHelpers();
        //LessonPrinciples4LAB();
        //LessonValueVsRef();
        //LessonHash();
        //LessonCollectionsLAB();
        //LessonComplexProperties();
        //LessonCollections();
        //LessonObjectsLAB();
        //LessonMethods();
        //LessonInheritance();
        //Test myTest = new Test();
        //System.out.println(myTest.Test_Method());
        //LessonClassObjects();
        //LessonLists();
        //LessonFundamentalsLAB();
        //String ScopeVar = "Ex";
        //LessonVariables(ScopeVar);
        //LessonDataTypes();



    }
    private static void LessonPrinciples5LAB(){
        //It could be useful to check if certain fields are filled such as those in Person
        Person pers1 = new Person("Bipin","Butala");
        pers1.setGender("Male");
        pers1.setTitle("Mentor");
        IPerson(pers1);
        System.out.println("-----------------------");
        Employee emp1 = new Employee("Camron","Chaboki");
        emp1.setTitle("Mentee");
        emp1.setGender("Alpha Male");
        IPerson(emp1);

        System.out.println("---------------------");
        String tmp = "Hello Fellow";
        System.out.println("Original String: "+tmp);
        System.out.println(backwardsChars("Original String: "+tmp));
        System.out.println("---------------------");
        pers1 = new Person("Aa", "Aa");
        Person pers2 = new Person("Aa","Ab");
        Person pers3 = new Person("Ab","Aa");
        System.out.println("Person 1: "+pers1.GetFullName());
        System.out.println("Person 2: "+pers2.GetFullName());
        System.out.println("Person 3: "+pers3.GetFullName());
        System.out.println("Comparing Person 1 to Person 2: "+pers1.compareTo(pers2));
        System.out.println("Comparing Person 1 to Person 3: "+pers1.compareTo(pers3));
        System.out.println("Comparing Person 2 to Person 3: "+pers3.compareTo(pers2));
        System.out.println("Comparing Person 3 to Person 1: "+pers3.compareTo(pers1));

        System.out.println(" ");
        Vehicle v1 = new Vehicle("AAAAAA");
        Vehicle v2 = new Vehicle("AAAAAB");
        System.out.println("Vehicle 1 License Plate: "+v1.getLicensePlate());
        System.out.println("Vehicle 2 License Plate: "+v2.getLicensePlate());
        System.out.println("Comparing Vehicle 1 to Vehicle 2: "+v1.compareTo(v2));
        System.out.println("Comparing Vehicle 2 to Vehicle 1: "+v2.compareTo(v1));

    }
    private static void IPerson(IPerson Iperson){
        System.out.println("Title set: " + Iperson.IsTitleSet());
        System.out.println("First name set: "+Iperson.IsFirstNameSet());
        System.out.println("Last name set: "+Iperson.IsLastNameSet());
        System.out.println("Gender set: " + Iperson.IsGenderSet());
    }
    private static String backwardsChars(CharSequence charSeq){
        String newString = new String();
        for(int i=charSeq.length()-1;i>=0;i--)
            newString += charSeq.charAt(i);
        return newString;
    }

    private static void LessonLogger(){}

    private static void LessonDebugger(){}

    private static void LessonInterfaceTest(){
        Site MN010 = new Site();
        MN010.setSiteName("MN010");
        MN010.setCoffeeMachines(2);
        MN010.setConferenceRooms(1);
        MN010.setCubicles(8);
        MN010.setOffices(6);
        MN010.setTraininggDesks(36);

        Home BipsHouse = new Home();
        BipsHouse.setAddress("1 Main St.");
        BipsHouse.setOwner(new Employee("Bipin","Butala"));

        LessonInterfaces(MN010);
        LessonInterfaces(BipsHouse);
    }

    private static void LessonInterfaces(ILocation Ilocation){
        System.out.println("Location Name: " + Ilocation.getLocationName());
        System.out.println("Can Have Meetings: " + Ilocation.canHaveMeetings());
        System.out.println("Number of Workspaces: " + Ilocation.numberOfWorkspaces());
        System.out.println("Has Coffee: " + Ilocation.hasCoffee()+"\n");
    }

    private static void LessonModuleHelpers(){
        int n = 2;
        MathHelper math = new MathHelper();
        n= math.square(4);
        System.out.println(n);

        String s=StringHelper.makeBackwards("Hello Fellow");
        System.out.println(s);
        System.out.println(StringHelper.numberOfTokens("Hello Fellow",'l'));
        System.out.println(StringHelper.Interleave("Hello","Fellowwwww"));

        System.out.println(MathHelper.raiseTo(2,10));
        System.out.println(MathHelper.Factorial(6));
        System.out.println(MathHelper.isSquareRoot(4,16));
        System.out.println(MathHelper.isSquareRoot(2,16));
        System.out.println(MathHelper.isSquareRoot(5,25));
        System.out.println(MathHelper.isSquareRoot(10,100));
    }

    private static void LessonPrinciples4LAB(){
        Hashtable<Integer, Character> htable = new Hashtable<>();
        //Character[] palindrome = new Character[]{'N','U','R','S','E','I','S','P','Y','G','Y','P','S','I','E','S','R','U','N'};
        String palindrome = "NURSEISPYGYPSIESRUN";
        for(int i=0;i<palindrome.length();i++)
            htable.put(i,palindrome.charAt(i));

        for(Integer key : htable.keySet())
            System.out.print(htable.get(key));
        HashMap<Integer, Character> hmap = new HashMap<>();
        for(int i=0;i<palindrome.length();i++)
            hmap.put(i,palindrome.charAt(i));
        System.out.println("\n-----------------");
        for(Integer key : hmap.keySet())
            System.out.print(hmap.get(key));
        System.out.println("\n-----------------");
        HashSet<Character> hset = new HashSet<>();
        for(int i=0;i<palindrome.length();i++)
            hset.add(palindrome.charAt(i));
        for(Character c : hset)
            System.out.print(c);

        //Problems 1 & 2 for Lab 4:
        //An Instance variable is a variable who's data is only held by the instance of the class containing that variable
        //An Instance Method must be called by an Instance of the Class (Getters and Setters)
        //Examples of Instance Methods would be any method created in BusinessObjects (com.astontech.BO)
        //Examples of Instance Variables would be any of the primitive data types used in Lessons & Labs.
        //A Static variable is a variable is a variable that is available without loading an instance of the class containing it,.
        //A Static method can be called without an instance of the class containing the method.
        //Examples of static methods are Main() or any method in this file (Main.java). They don't need to be called by an instance of the class Main.
        //Examples of static variables would be a counter for the number of instances of a class. That counting variable would have to be static.

        //Reference type holds memory address, that memory address holds the actual value
        //While Value types hold the data directly
        //Strings are weird because strings point to addresses on string heap
        //Reference type examples: Any Class Object we created, String, Arrays
        //Value type examples: all prim data types,
        }

    private static void LessonValueVsRef(){
        Employee firstEmp = new Employee("Bipin","Butala");
        Employee secondEmp = firstEmp;
        firstEmp.setFirstName("Camron");

        System.out.println(secondEmp.getFirstName());

        int firstInt = 10;
        int secondInt = firstInt;
        firstInt = 20;
        System.out.println(secondInt);

        Integer firstInteger = 10;
        Integer secondInteger = firstInteger;
        firstInteger = 20;
        System.out.println(secondInteger);

        String s1 = "Hi";
        String s2 = s1;
        s1 = "Bye";
        System.out.println(s2);

    }

    private static void LessonHash(){
        System.out.println("------HASH TABLE------");

        Hashtable<Integer, String> firstHashTable = new Hashtable<>();
        firstHashTable.put(1, "Abstraction");
        firstHashTable.put(2, "Polymorphism");
        firstHashTable.put(3, "Inheritance");
        firstHashTable.put(4, "Encapsulation");
        //firstHashTable.put(null, "d");    //NullPointerException

        for(Integer key : firstHashTable.keySet()){
            System.out.println("key: "+key+" | value: "+firstHashTable.get(key));
        }

        //System.out.println("Value from given key: "+oopPrinicip.get(3));
        System.out.println("----------------------");

        System.out.println("--------HASH MAP---------");

        HashMap<Integer, String> firstHashMap = new HashMap<>();
        firstHashMap.put(1, "Abstraction");
        firstHashMap.put(2, "Polymorphism");
        firstHashMap.put(3, "Inheritance");
        firstHashMap.put(4, "Encapsulation");
        firstHashMap.put(5, "Encapsulation"); //accepts duplicates
        firstHashMap.put(6, null); //no NullPointerException

        for(Integer key : firstHashMap.keySet())
            System.out.println("key: "+key+" | value: "+firstHashMap.get(key));

        System.out.println("--------------------------");

        System.out.println("----------HASH SET---------------");

        HashSet<String> firstHashSet = new HashSet<>();
        firstHashSet.add("Abstracton");
        firstHashSet.add("Polymorphism");
        firstHashSet.add("Inheritance");
        firstHashSet.add("Encapsulation");

        for(String s : firstHashSet)
            System.out.println(s);

        System.out.println("-------------------------");
    }

    private static void LessonCollectionsLAB(){
        List<Vehicle> VehicleList = new ArrayList<>();
        Vehicle veh1 = new Vehicle("ABC123");
        veh1.setId(1);
        veh1.setVehicleId(1);
        veh1.setYear(1998);
        veh1.setVIN("11011001001101101");
        veh1.setColor("Black");
        veh1.setIsPurchase(true);
        veh1.setPurchasePrice(7900);
        veh1.setPurchaseDate(new Date(69,3,20, 4, 20, 69));
        veh1.setVehicleModel(new VehicleModel("Accord"));
        veh1.getVehicleModel().setVehicleMake(new VehicleMake("Honda"));
        VehicleList.add(veh1);
        Vehicle veh2 = new Vehicle("DEF456");
        veh2.setId(2);
        veh2.setVehicleId(2);
        veh2.setYear(1999);
        veh2.setVIN("66666666666666666");
        veh2.setColor("Red");
        veh2.setIsPurchase(false);
        veh2.setPurchasePrice(666);
        veh2.setPurchaseDate(new Date(-1234,5,6,6,6,6));
        veh2.setVehicleModel(new VehicleModel("Demon"));
        veh2.getVehicleModel().setVehicleMake(new VehicleMake("Dodge"));
        VehicleList.add(veh2);
        String[] Colors = new String[]{"Red","Blue","Green","Yellow","White","Black","Silver","Purple","Orange","Gold"};
        Boolean[] Options = new Boolean[]{true,false};
        Random random = new Random();

        Vehicle veh3 = new Vehicle(RandomString.getAlphaNumericString(6));
        veh3.setId(3);
        veh3.setVehicleId(3);
        veh3.setYear((int)(Math.random()*100001*100001*100001*101));
        veh3.setVIN(String.valueOf((int)(Math.random()*10000)));
        veh3.setColor(Colors[(int)(Math.random()*10)]);
        veh3.setIsPurchase(random.nextBoolean());
        veh3.setPurchasePrice((int)(Math.random()*10000));
        veh3.setPurchaseDate(new Date((int)(Math.random()*1000),(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*100)));
        veh3.setVehicleModel(new VehicleModel(RandomString.getAlphaNumericString((int)Math.random()*10+5)));
        veh3.getVehicleModel().setVehicleMake(new VehicleMake(RandomString.getAlphaNumericString((int)Math.random()*10+5)));
        VehicleList.add(veh3);

        for(int i=4;i<10;i++){
            Vehicle tempVehicle = new Vehicle(RandomString.getAlphaNumericString(6));
            tempVehicle.setId(i);
            tempVehicle.setVehicleId(i);
            tempVehicle.setYear((int)(Math.random()*10000));
            tempVehicle.setVIN(String.valueOf((int)(Math.random()*10000)));
            tempVehicle.setColor(Colors[(int)(Math.random()*10)]);
            tempVehicle.setIsPurchase(random.nextBoolean());
            tempVehicle.setPurchasePrice((int)(Math.random()*10000));
            tempVehicle.setPurchaseDate(new Date((int)(Math.random()*1000),(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*100)));
            tempVehicle.setVehicleModel(new VehicleModel(RandomString.getAlphaNumericString((int)Math.random()*10+5)));
            tempVehicle.getVehicleModel().setVehicleMake(new VehicleMake(RandomString.getAlphaNumericString((int)Math.random()*10+5)));
            VehicleList.add(tempVehicle);
        }



        for(Vehicle SingleVehicle : VehicleList)
            System.out.println(SingleVehicle.ToString());

    }

    private static void LessonComplexProperties(){
        EntityType emailWorkType = new EntityType("Work");
        emailWorkType.setEntityTypeId(1);

        Email myEmail = new Email("bipin@bip.com");
        myEmail.setEmailType(emailWorkType);

        System.out.println(myEmail.getEmailAddress()+" Type:"+myEmail.getEmailType().getEntityTypeName()+" Id:"+myEmail.getEmailType().getEntityTypeId());

        Employee myEmployee = new Employee();
       // myEmployee.getE
        myEmployee.getEmails().add(new Email("test1@test.com"));
        myEmployee.getEmails().add(new Email("dan@test.com"));
        myEmployee.getEmails().add(new Email("jason@test.com"));
        myEmployee.getEmails().add(new Email("fjfjfj@fjfjfj"));

        for(Email email : myEmployee.getEmails())
            System.out.println(email.getEmailAddress());
    }

    private static void LessonCollections(){
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Dan","Simmer");
        Employee emp2 = new Employee("James","McRoberts");
        Employee emp3 = new Employee("Sean","Nilsen");
        Employee emp4 = new Employee("Adrian","Hatayake");

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        employeeList.add(new Employee("John","Doe"));
        for(int i=0;i<employeeList.size();i++)
            System.out.println(employeeList.get(i).GetFullName());
        for(Employee e : employeeList)
            System.out.println(e.GetFullName());
    }

    private static void LessonObjectsLAB(){
        //address
        Address add1 = new Address(1);
        add1.setAddressNumber(5555);
        add1.setStreet("Sesame St.");
        add1.setCity("Crystal");
        System.out.println(add1.GetFullAddress());
        //Client
        Client cli1 = new Client(1);
        System.out.println("Client Id = "+cli1.getClientId());
        //ClientContact
        ClientContact clicon1 = new ClientContact(1);
        System.out.println("ClientContact Id = "+clicon1.getClientContactId());
        //Email
        Email em1 = new Email("wtf@holyshite.com");
        em1.setEmailId(1);
        System.out.println(em1.getEmailAddressAndEmployee());
        //Employee
        Employee emp1 = new Employee("Camron","Chaboki");
        System.out.println(emp1.GetFullName());
        //Employee Project
        EmployeeProject empproj1 = new EmployeeProject(1);
        System.out.println("Employee Project Id = "+empproj1.getEmployeeProjectId());
        //Entity
        Entity ent1 = new Entity(1);
        ent1.setEntityName("NameO'Entity");
        System.out.println(ent1.GetEntityIdAndName());
        //EntityType
        EntityType enttype1 = new EntityType(1);
        System.out.println("Entity Type Id = "+enttype1.getEntityTypeId());
        //LoyaltyAccount
        LoyaltyAccount loyacc1 = new LoyaltyAccount(1);
        System.out.println("Loyalty Account Id = "+loyacc1.getLoyaltyAccountId());
        //LoyaltyCompany
        LoyaltyCompany loycomp1 = new LoyaltyCompany(1);
        System.out.println("Loyalty Company Id = "+loycomp1.getLoyaltyCompanyId());
        //Person
        Person pers1 = new Person("Johnson");
        System.out.println(pers1.GetFullName());
        //Phone
        Phone phone1 = new Phone("5551234");
        phone1.setAreaCode("000");
        System.out.println(phone1.GetAreaCodeAndPhoneNumber());
        //Project
        Project proj1 = new Project("Super Secret Project");
        System.out.println(proj1.getProjectName());
        //ProjectStatus
        ProjectStatus projstat1 = new ProjectStatus(1);
        System.out.println("Project Status Id = "+projstat1.getProjectStatusId());
        //Review
        Review rev1 = new Review("Super Top Notch Review");
        System.out.println(rev1.getReviewName());
        //ReviewData
        ReviewData revdat1 = new ReviewData(1);
        System.out.println("Review Data Id = "+revdat1.getReviewDataId());
        //Training
        Training tr1 = new Training("Super Secret God Training");
        System.out.println(tr1.getTrainingName());
        //TrainingData
        TrainingData trd1 = new TrainingData(1);
        System.out.println("Training Data Id = "+trd1.getTrainingDataId());
        //Vehicle
        Vehicle veh1 = new Vehicle("QWE123");
        System.out.println(veh1.getLicensePlate());
        //VehicleMake
        VehicleMake vehmk1 = new VehicleMake("Honda");
        System.out.println(vehmk1.getVehicleMakeName());
        //VehicleModel
        VehicleModel vehmdl1 = new VehicleModel("Accord");
        System.out.println(vehmdl1.getVehicleModelName());
        //VehicleStatus
        VehicleStatus vehst1 = new VehicleStatus(1);
        System.out.print("Vehicle Status Id = "+vehst1.getVehicleStatusId());
    }

    private static void LessonMethods(){
        Employee constructorEmployee = new Employee("Bipin", "Butala");
        System.out.println(constructorEmployee.getFirstName()+" "+constructorEmployee.getLastName());

        Employee const2 = new Employee("Simmer");
        System.out.println(const2.getLastName());

        Employee employeeJames = new Employee("James","McRoberts");
        System.out.println(employeeJames.GetFullName());
    }

    private static void LessonInheritance(){
        //APIE: Abstraction, Polymorphism, Inheritance, Encapsulation

        Employee employeeBip = new Employee();
        employeeBip.setFirstName("Bipin");
        employeeBip.setLastName("Butala");
        employeeBip.setId(3);

        System.out.println(employeeBip.getFirstName()+" "+employeeBip.getLastName()+" "+employeeBip.getId());
    }

    private static void LessonClassObjects() {
        Person myFirstPerson = new Person();
        myFirstPerson.setFirstName("Bipin");
        myFirstPerson.setLastName("Butala");
        myFirstPerson.setTitle("Mr.");

        System.out.println(myFirstPerson.getFirstName());
        System.out.println(myFirstPerson.getLastName());
        System.out.println(myFirstPerson.getTitle()+' '+myFirstPerson.getFirstName()+' '+myFirstPerson.getLastName());

        myFirstPerson.setId(3);
        System.out.println(myFirstPerson.getId());

        myFirstPerson = new Person();
        System.out.println(myFirstPerson.getFirstName());
        System.out.println(myFirstPerson.getLastName());
        System.out.println(myFirstPerson.getTitle()+' '+myFirstPerson.getFirstName()+' '+myFirstPerson.getLastName());
        System.out.println(myFirstPerson.getId());
    }

    private static void LessonFundamentalsLAB(){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a Number from 1 to 10:  ");
        String Input = read.nextLine();
        float tmp = Float.valueOf(Input);
        System.out.println("Adding 1.75 gives us: " +String.format("%.2f",((float)tmp+1.75)));

        boolean minBool = false;
        boolean maxBool = true;
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        System.out.println("Min Boolean Value = " + minBool);
        System.out.println("Max Boolean Value = " + maxBool);
        System.out.println("Min Byte Value = " + minByte);
        System.out.println("Max Byte Value = " + maxByte);
        System.out.println("Min Int Value = " + minInt);
        System.out.println("Max Int Value = " + maxInt);
        System.out.println("Min Short Value = " + minShort);
        System.out.println("Max Short Value = " + maxShort);
        System.out.println("Min Float Value = " + minFloat);
        System.out.println("Max Float Value = " + maxFloat);
        System.out.println("Min Long Value = " + minLong);
        System.out.println("Max Long Value = " + maxLong);
        System.out.println("Min Double Value = " + minDouble);
        System.out.println("Max Double Value = " + maxDouble);
        System.out.println("Min Char Value = " + " " + " (It's a space)");
        System.out.println("Max Char Value = " + "~");
        System.out.println("Min Typical Char = " + 'a' );
        System.out.println("Max Typical Char = "+ 'Z');
        System.out.println("\nDid you know that a String is just a sequence of characters?");
        System.out.print("I'll prove it. Enter a word: ");
        Input = read.nextLine();
        System.out.println("I will now break this string down into its smaller components...");
        for(int i=0;i<Input.length();i++)
            System.out.println(Input.charAt(i));

        System.out.println("Creating List of Random Numbers and Printing Them");
        List<Integer> IntList = new ArrayList<Integer>();
        for(int i=0;i<(int)(Math.random()*100+3);i++)
            IntList.add((int)(Math.random()*10));
        for(int SingleInt : IntList)
            System.out.print(SingleInt+" ");

        System.out.println("Did you know you can't make a list of char or int because those are data types and not classes?");
        System.out.println("int and char are for instances of variables while Integer and Character are classes.");

        System.out.println("\nCreating Variables for Lottery");
        String GameName = "Powerball";
        int[] WinningNumbers = new int[]{4, 20, 69, 100, -1, 0};
        List<Integer> WinNums = new ArrayList<Integer>();
        for(int i=0;i<6;i++)
            WinNums.add((int)(Math.random()*10));
        int Jackpot = 1000000;
        Date DrawingDate = new Date(69, 3, 20, 4, 20);
        System.out.println(DrawingDate);
        System.out.println("Lottery Game: " + GameName);
        //System.out.println("Winning Numbers: " + WinningNumbers);
        System.out.println("Winning Numbers: " + WinNums);
        System.out.println("Jackpot: $" + Jackpot);
        System.out.println("Drawing Date: " + DrawingDate);

    }

    private static void LessonLists(){
        List<String> myStringCollection = new ArrayList<String>();

        myStringCollection.add("1st String");
        myStringCollection.add("2nd String");
        myStringCollection.add("3rd String");
        myStringCollection.add("4th String");
        myStringCollection.add("5th String");
        for(String singleString : myStringCollection){
            System.out.println(singleString);
        }
        System.out.println(myStringCollection);

        List<Integer> myIntCollection = new ArrayList<Integer>();
        myIntCollection.add(10);
        myIntCollection.add(20);
        myIntCollection.add(30);
        myIntCollection.add(40);
        myIntCollection.add(50);
        for(int singleInt : myIntCollection){
            System.out.println(singleInt);
        }
        System.out.println(myIntCollection);
        for(int i=0;i<myIntCollection.size();i++){
            System.out.println(myIntCollection.get(i));
        }
        String[] myStringArray = new String[5];

        myStringArray[0] = "1st";
        myStringArray[1] = "2nd";
        myStringArray[2] = "3rd";
        myStringArray[3] = "4th";
        myStringArray[4] = "5th";

        System.out.println(myStringArray);
        for(String singleString : myStringArray){
            System.out.println(singleString);
        }


    }

    private static void LessonDataTypes(){}

    private static void LessonVariables(String ScopeVar){
        String LastName = "Butala", FirstName = "Bipin";
        System.out.println(FirstName +' '+ LastName);

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String input = reader.nextLine();

        System.out.println(input +" is cool");
        System.out.println(ScopeVar);
    }
}
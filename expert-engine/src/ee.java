public class ee {


    int SIZE = 10;
    int SIZETWO = 10;
    String[] structure = new String[SIZE];
    String[] structureTwo = new String[SIZETWO];
    int countS = 0;
    int countST = 0;
    public static void main(String[] args)
    {

    }

    public void InsertInStructure(String toLearn)
    {
        structure[SIZE - 1 - countS] = toLearn;
        countS = countS + 1;
    }

    public void InsertInStructureTwo(String toReturnTo)
    {
        /*
        Structure One loses one and all move forward one
         */
        structureTwo[countST - 1] = toReturnTo;
        countST = countST + 1;
    }

    public void SendToStructureOne()
    {
        /*
        Structure One gains one and each String in structure one moves forward one
         and each String in Structure Two moves down one
         */
    }

    public void SendToMind()
    {
        //BDRC
    }




}

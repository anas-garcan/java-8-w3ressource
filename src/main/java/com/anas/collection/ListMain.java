package com.anas.collection;

public class ListMain {
    static void main() {
        System.out.println("For the reviewer, please uncomment  the code of each alone and test it.");

       /* System.out.println("----------------------------------------------1. Create and Print ArrayList------------------------------------------------");
        List<String> ls = new ArrayList<>();
        System.out.println("Call method for add colors  \n"+UtilsList.addColors(ls));*/


        /*System.out.println("----------------------------------------------2. Iterate ArrayList Elements------------------------------------------------");
        List<Integer> li = new ArrayList<>();
        System.out.println("Iterate list li   \n");
                UtilsList.parcour(li);*/

        /*System.out.println("----------------------------------------------3. Insert at First Position------------------------------------------------");
        List<Integer> listInsertAtFirstPosition = new ArrayList<>();

        System.out.println("Traitements of insert element at first position  \n"+UtilsList.InsertElement(listInsertAtFirstPosition,99));*/

        /*System.out.println("---------------------------------------------4. Retrieve Element by Index-------------------------------------------------");
        List<Integer> retrieveElementOfList = new ArrayList<>();
        System.out.println(UtilsList.RetrieveElement(retrieveElementOfList));*/

        /*System.out.println("---------------------------------------------5.Update ArrayList Element-------------------------------------------------");
        List<Integer> updateArrayList = new ArrayList<>();
        System.out.println(UtilsList.EditElement(updateArrayList));*/

       /* System.out.println("---------------------------------------------6.Remove Third Element-------------------------------------------------");
        List<Integer> listOfRemoveElement = new ArrayList<>();
        System.out.println(UtilsList.removeThirdElement(listOfRemoveElement));*/

       /* System.out.println("---------------------------------------------7. Search Element in ArrayList-------------------------------------------------");
        List<Integer> searchElement = new ArrayList<>();
        System.out.println(UtilsList.searchElementInArrayList(searchElement,3
        ));*/

        /*
        System.out.println("---------------------------------------------8. Sort ArrayList-------------------------------------------------");
        List<String> listForSort = new ArrayList<>();
        listForSort.add("P");
        listForSort.add("G");
        listForSort.add("D");
        listForSort.add("B");
        listForSort.add("F");
        System.out.println(UtilsList.listSort(listForSort));*/


        /*System.out.println("---------------------------------------------9. Copy ArrayList-------------------------------------------------");
        List<String> copiedList = new ArrayList<>();
        List<String> ListForCopy = new ArrayList<>();
        System.out.println(UtilsList.copyList(copiedList,ListForCopy));*/

      /*  System.out.println("---------------------------------------------10. Shuffle ArrayList-------------------------------------------------");
        List<Double> mixList = new ArrayList<>();

        System.out.println(UtilsList.mixList(mixList)); */

        /*System.out.println("---------------------------------------------11. Reverse ArrayList-------------------------------------------------");
        List<Integer> reverseList = new ArrayList<>();
        reverseList.add(1);
        reverseList.add(3);
        reverseList.add(4);
        reverseList.add(8);
        System.out.println(reverseList);

        System.out.println(UtilsList.reverseList(reverseList));*/


       /* System.out.println("---------------------------------------------12. Extract Sublist from ArrayList-------------------------------------------------");
        List<Integer> listForSubList = new ArrayList<>();
        listForSubList.add(5);
        listForSubList.add(6);
        listForSubList.add(5);
        listForSubList.add(8);
        listForSubList.add(99);
        System.out.println("list After  "+listForSubList);
        System.out.println(UtilsList.listSubList(listForSubList,0,3));*/


       /* System.out.println("---------------------------------------------13. Compare Two ArrayLists-------------------------------------------------");
        List<Integer> listOne = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(5);
        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(1);
        listTwo.add(2);
        listTwo.add(3);
        listTwo.add(5);
        System.out.println("Comparaison     \n"+UtilsList.listComparaison(listTwo,listTwo) );*/

       /* System.out.println("---------------------------------------------Swap ArrayList Elements-------------------------------------------------");
        List<String> listForSwap = new ArrayList<>();
        listForSwap.add("Hello");
        listForSwap.add("How are you");
        listForSwap.add("Are you ok");
        listForSwap.add("I'm good");
        System.out.println("Before swap :  \n"+listForSwap);
        System.out.println("After swap  :    \n"+UtilsList.listSwap(listForSwap,"How are you","I'm good"));*/

        /*System.out.println("---------------------------------------------15. Join Two ArrayLists-------------------------------------------------");
        List<Integer> listForJoin1 = new ArrayList<>();
        Collections.addAll(listForJoin1,1,6,4,7,9,7);
        List<Integer> listForJoin2 = new ArrayList<>();
        Collections.addAll(listForJoin2,5,4,8,9,6,4,2);
        System.out.println("listForJoin1 and listForJoin2 fusion  :     \n"+UtilsList.listFusion(listForJoin1,listForJoin2));*/

        /*System.out.println("---------------------------------------------16. Clone ArrayList-------------------------------------------------");
        List<Integer> listForClone1  = new ArrayList<>();
        listForClone1.add(8);
        listForClone1.add(7);
        listForClone1.add(5);
        List<Integer> listForClone2  = new ArrayList<>();

        System.out.println("Clone listForClone1  in listForClone2   :   \n"+UtilsList.cloneList(listForClone1,listForClone2));*/

        /*System.out.println("---------------------------------------------17. Clear ArrayList-------------------------------------------------");
        List<Integer> listForClear = new ArrayList<>();
        listForClear.add(8);
        listForClear.add(5);
        listForClear.add(23);
        listForClear.add(32);
        System.out.println("For clear listForClear   :");
        UtilsList.clearListe(listForClear);*/

       /* System.out.println("---------------------------------------------18. Check if ArrayList is Empty-------------------------------------------------");
        List<Integer> listForVerifyIfListEmptyOrNot = new ArrayList<>();
        listForVerifyIfListEmptyOrNot.add(1);

        System.out.println("Verify the list if empty or not:      \n"+UtilsList.verifyIfListEmptyOrNot(listForVerifyIfListEmptyOrNot));*/

        /*System.out.println("---------------------------------------------Trim ArrayList Capacity-------------------------------------------------");
        ArrayList<Integer> listForReduceTheCapacity = new ArrayList<>(1000);
        listForReduceTheCapacity.add(10);
        listForReduceTheCapacity.add(20);
        listForReduceTheCapacity.add(30);
        listForReduceTheCapacity.add(40);

        System.out.println("Before : " + listForReduceTheCapacity);

        List<Integer> result = UtilsList.reduceCapacityOfList(listForReduceTheCapacity);

        System.out.println("After : " + result);*/

      /*  System.out.println("---------------------------------------------20. Increase ArrayList Capacity-------------------------------------------------");
        ArrayList<String>  listForIncreaseTheCapacityOfList = new ArrayList<>();
        listForIncreaseTheCapacityOfList.add("Java");
        listForIncreaseTheCapacityOfList.add("Spring");
        listForIncreaseTheCapacityOfList.add("Angular");
        System.out.println("Before : " + listForIncreaseTheCapacityOfList);

        List<String> result = UtilsList.increaseListCapacity(listForIncreaseTheCapacityOfList);

        System.out.println("After : " + result);*/


        /*System.out.println("---------------------------------------------21. Replace Second Element-------------------------------------------------");
        ArrayList<String> listForReplaceTheSecondElement = new ArrayList<>();
        listForReplaceTheSecondElement.add("Hello");
        listForReplaceTheSecondElement.add("React");
        listForReplaceTheSecondElement.add("Java");
        System.out.println("Before");
        System.out.println(listForReplaceTheSecondElement);
        System.out.println("After");
        System.out.println("replace the second element of an ArrayList    \n"+UtilsList.replaceTheSecondElement(listForReplaceTheSecondElement,"Goodbye code AI comming"));*/

       /* System.out.println("---------------------------------------------22. Print Elements by Position-------------------------------------------------");
        List<String> listForPrint = List.of("Java","JavaScript","Flutter","Maven","Python","React","Angular");

        System.out.println("PrintList");
        UtilsList.printItemsPosition(listForPrint);*/
    }
}

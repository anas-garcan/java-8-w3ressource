package com.anas.collection;

public class SetMain {
    static void main() {
        System.out.println("Pour le reviewer  décommenter le code de chaque méthode  et le tester.");

       /* System.out.println("----------------------------------------------1. Ajouter l'élément à l'ensemble de hachage------------------------------------------------");
        Set<Integer> setForAdd = new HashSet<>();
        UtilsSet.addToSet(setForAdd,1);
        UtilsSet.addToSet(setForAdd,2);
        UtilsSet.addToSet(setForAdd,3);
        UtilsSet.addToSet(setForAdd,8);

        System.out.println("result :    "+setForAdd); */

       /*
       System.out.println("----------------------------------------------2. Parcourir les éléments de HashSet------------------------------------------------");
       Set<Integer> setPourParcourir = new HashSet<>();

        setPourParcourir.add(5);
        setPourParcourir.add(8);
        setPourParcourir.add(9);

        UtilsSet.parcourirSet(setPourParcourir);*/


       /* System.out.println("----------------------------------------------3. Obtenir la taille du HashSet------------------------------------------------");
        Set<Integer> setPourRecupererLaTaille = new HashSet<>();

        setPourRecupererLaTaille.add(4);
        setPourRecupererLaTaille.add(5);
        setPourRecupererLaTaille.add(8);
        setPourRecupererLaTaille.add(9);

        System.out.println("La taille de la liste:         "+UtilsSet.listSize(setPourRecupererLaTaille));*/

       /* System.out.println("----------------------------------------------4. Effacer le HashSet------------------------------------------------");
        Set<String> setPourEffacerLaSet = new HashSet<>();
        UtilsSet.setErase(setPourEffacerLaSet);
        setPourEffacerLaSet.add("Anas");
        UtilsSet.setErase(setPourEffacerLaSet);
        System.out.println("Etat du set   \n"+setPourEffacerLaSet);*/

       /* System.out.println("----------------------------------------------5. Vérifier si HashSet est vide------------------------------------------------");

        HashSet<String> setPourVerifierHashSetSiVide = new HashSet<>();
        UtilsSet.ifHashSetEmpty(setPourVerifierHashSetSiVide);
        setPourVerifierHashSetSiVide.add("Hello");
        System.out.println("After Add");
        UtilsSet.ifHashSetEmpty(setPourVerifierHashSetSiVide);*/


      /*  System.out.println("----------------------------------------------6. Cloner le HashSet------------------------------------------------");
        HashSet<String> setForClone = new HashSet<>();

        setForClone.add("Hello");
        setForClone.add("American dream");
        setForClone.add("French cars ");

        HashSet<String> setToClone = new HashSet<>();

        System.out.println("Clone   :  "+UtilsSet.hashSetClone(setForClone,setToClone));

        System.out.println("setForClone  "+setForClone);*/


        /*System.out.println("----------------------------------------------7. Convertir un HashSet en tableau------------------------------------------------");

        HashSet<Integer> setForConvertToTable = new HashSet<>();
        setForConvertToTable.add(4);
        setForConvertToTable.add(6);
        setForConvertToTable.add(9);
        setForConvertToTable.add(6);
        System.out.println("Concertir HashSet en tableau:                 \n"+Arrays.toString(UtilsSet.setConvertToArray(setForConvertToTable)));*/


        /*System.out.println("----------------------------------------------8. Convertir HashSet en TreeSet------------------------------------------------");

        HashSet<Integer> setToTreeSet = new HashSet<>();

        setToTreeSet.add(50);
        setToTreeSet.add(10);
        setToTreeSet.add(30);
        setToTreeSet.add(20);
        setToTreeSet.add(40);

        System.out.println("Convertion du Set en TreeSet:   "+UtilsSet.convertSetToTreeSet(setToTreeSet));*/

        /*System.out.println("---------------------------------------------- 9. Trouver les éléments inférieurs à 7 dans l'ensemble arborescent------------------------------------------------");

        TreeSet<Integer> find = new TreeSet<>();
        find.add(1);
        find.add(5);
        find.add(8);
        find.add(4);
        find.add(78);
        System.out.println("Trouver les éléments inférieurs à 7 dans l'ensemble arborescent    :   \n");
                UtilsSet.findElementInTreeSet(find);*/


       /* System.out.println("----------------------------------------------10. Comparer deux ensembles de hachage------------------------------------------------");

        HashSet<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();

        s1.add("Scrum");
        s1.add("Angular");
        s1.add("React");

        s2.add("Scrum");
        s2.add("Angular");
        s2.add("React");

        System.out.println("Comparaison  de s1 et s2:   ");
        UtilsSet.compareTwoHashSets(s1,s2);

        HashSet<String> s3 = new HashSet<>();
        HashSet<String> s4 = new HashSet<>();

        s3.add("Scrum");
        s3.add("Angular");
        s3.add("React");

        s4.add("Java");
        s4.add("C#");
        s4.add("React Native");
        System.out.println("Comparaison  de s3 et s4:   ");
        UtilsSet.compareTwoHashSets(s3,s4);*/

       /* System.out.println("----------------------------------------------11. Conserver les éléments communs dans les ensembles------------------------------------------------");

        HashSet<Integer> hashSetForCommonElements1 = new HashSet<>();
        hashSetForCommonElements1.add(4);
        hashSetForCommonElements1.add(9);
        hashSetForCommonElements1.add(12);
        hashSetForCommonElements1.add(26);
        hashSetForCommonElements1.add(13);

        HashSet<Integer> hashSetForCommonElements2 = new HashSet<>();
        hashSetForCommonElements2.add(56);
        hashSetForCommonElements2.add(9);
        hashSetForCommonElements2.add(12);
        hashSetForCommonElements2.add(26);
        hashSetForCommonElements2.add(13);
        hashSetForCommonElements2.add(66);
        hashSetForCommonElements2.add(65);
        hashSetForCommonElements2.add(231);

        System.out.println("Common elements are :  "+UtilsSet.retainCommonElements(hashSetForCommonElements1,hashSetForCommonElements2));*/


        /*System.out.println("----------------------------------------------12. Supprimer tout du HashSet------------------------------------------------");

        HashSet<Integer> hashSetForRemove = new HashSet<>();
        hashSetForRemove.add(7);
        hashSetForRemove.add(9);
        hashSetForRemove.add(5);
        System.out.println("Remove hashSet :  ");
        UtilsSet.removeHashSet(hashSetForRemove);*/

    }
}

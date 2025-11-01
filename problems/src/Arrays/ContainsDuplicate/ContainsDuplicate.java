
public static boolean containsDuplicate(int arr[]) {
    //Step 1: Create a HashSet to store elements from the array
    HashSet<Integer> set = new HashSet<>();

    //Step 2: Iterate through each element of the given array
    for(int num : arr){
        //Step 3: If the HashSet contains the element, return true
        if(set.contains(num)){
            return true; // Duplicate found
        }
        //Step 3: Else, add the element to the HashSet
        set.add(num);
    }
    return false; // No Duplicates found
}

public static void main(String[] args) {
    int arr1[] = new int[] {1,4,3,5,4};
    System.out.println(containsDuplicate(arr1));

    int arr2[] = new int[] {6,5,3,1,7,2};
    System.out.println(containsDuplicate(arr2));
}


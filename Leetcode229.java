class Solution {
    
    public static List<Integer> majorityElement(int []v) {

        List<Integer> ls = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        int n = v.length;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(cnt1 == 0 && ele2 != v[i]){
                cnt1 = 1;
                ele1 = v[i];
            }else if(cnt2 == 0 && ele1 != v[i]){
                cnt2 = 1;
                ele2 = v[i];
            }else if(v[i] == ele1) {
                cnt1++;
            }else if(v[i] == ele2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for(int i = 0; i < n; i++){
            if(v[i] == ele1) cnt1++;
            if(v[i] == ele2) cnt2++;
        }

        int mini = (int)(n/3)+1;
        if(cnt1 >= mini) ls.add(ele1);
        if(cnt2 >= mini) ls.add(ele2);

        return ls;




        // List<Integer> ls = new ArrayList<>();
        // int cnt = 0;
        // int n = v.length;
        // for(int i = 0; i < n; i++){
        //     cnt = 0;
        //     if(ls.size() == 0 || ls.get(0) != v[i]){
        //         for(int j = 0; j < n; j++){
        //             if(v[i] == v[j]){
        //                 cnt++;
        //             }
        //         }
        //         if(cnt > n / 3){
        //             ls.add(v[i]);
        //         }
        //     }
        //     if (ls.size() == 2) break;
        // }

        // return ls;















        // int n = v.length; //size of the array

        // int cnt1 = 0, cnt2 = 0; // counts
        // int el1 = Integer.MIN_VALUE; // element 1
        // int el2 = Integer.MIN_VALUE; // element 2

        // // applying the Extended Boyer Moore's Voting Algorithm:
        // for (int i = 0; i < n; i++) {
        //     if (cnt1 == 0 && el2 != v[i]) {
        //         cnt1 = 1;
        //         el1 = v[i];
        //     } else if (cnt2 == 0 && el1 != v[i]) {
        //         cnt2 = 1;
        //         el2 = v[i];
        //     } else if (v[i] == el1) cnt1++;
        //     else if (v[i] == el2) cnt2++;
        //     else {
        //         cnt1--; cnt2--;
        //     }
        // }

        // List<Integer> ls = new ArrayList<>(); // list of answers

        // // Manually check if the stored elements in
        // // el1 and el2 are the majority elements:
        // cnt1 = 0; cnt2 = 0;
        // for (int i = 0; i < n; i++) {
        //     if (v[i] == el1) cnt1++;
        //     if (v[i] == el2) cnt2++;
        // }

        // int mini = (int)(n / 3) + 1;
        // if (cnt1 >= mini) ls.add(el1);
        // if (cnt2 >= mini) ls.add(el2);

        // // Uncomment the following line
        // // if it is told to sort the answer array:
        // //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        // return ls;
    }
}
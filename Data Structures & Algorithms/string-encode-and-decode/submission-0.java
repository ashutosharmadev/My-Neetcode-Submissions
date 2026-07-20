class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded= new StringBuilder(); // Encodes list of strings into a single string
        for(String str:strs){
            encoded.append(str.length()).append("#").append(str); // Stores length of string and places # next to string
        }
        return encoded.toString(); //4#Hello4#World example
    }

    public List<String> decode(String str) {
        List<String> result= new ArrayList<>(); // Decodes the single string into list of strings
        int i=0; // initialise i pointer to indicate current position in string
        while(i<str.length()){ //Continue until the entire string has been traversed 
            int j=i; // j pointer is used to find the # delimitor
            while(str.charAt(j)!='#'){
                j++; // Keep moving j pointer across until it encounters the delimitor
            }
        int length= Integer.parseInt(str.substring(i,j)); // Characters from i and j-1 represent length of next string
        i=j+1; //Move i to the first character of the string
        result.add(str.substring(i,i+length)); // Extract the string
        i+=length; // Move i to the beginning of next encoded string 
    }
    return result;
    }
} 
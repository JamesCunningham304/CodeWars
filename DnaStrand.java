public class DnaStrand {
  public static String makeComplement(String dna) {
    if(dna.length() == 0){
      return "-1";
    }
    StringBuilder sb
            = new StringBuilder(dna);
    for(int i = 0; i <= dna.length()-1; i++){
      if(dna.charAt(i) == 'A'){
       sb.setCharAt(i, 'T');
      }
      if(dna.charAt(i) == 'T'){
       sb.setCharAt(i, 'A');
      }
      if(dna.charAt(i) == 'C'){
       sb.setCharAt(i, 'G');
      }
      if(dna.charAt(i) == 'G'){
       sb.setCharAt(i, 'C');
      }
    }
    return sb.toString(); //Your code
  }
}

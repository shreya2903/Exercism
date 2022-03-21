class RnaTranscription {

    String transcribe(String dnaStrand) {
        int len= dnaStrand.length();
        String result = "";
        for(int i=0; i < len ; i++){
            if (dnaStrand.charAt(i)=='G'){
                result += 'C';
            }
            else if (dnaStrand.charAt(i) == 'C'){
                result += 'G';
            }
            else if (dnaStrand.charAt(i) == 'T'){
                result += 'A';
            }
            else if(dnaStrand.charAt(i) == 'A'){
                result += 'U';
            }
        }
        return result;
    }

}

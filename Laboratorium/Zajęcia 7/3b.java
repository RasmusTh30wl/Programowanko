    public static void displaySumOfNumersInLines( String path ) throws IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(path));
        String line;
        String outputFileText = new String();
        int index = 0;
        StringTokenizer textFromFile;
        while((line=inputFile.readLine()) != null){
            StringBuilder sb = new StringBuilder();
            sb.append(line);
            textFromFile = new StringTokenizer(sb.toString());
            int sum = 0;
            boolean isEqualitySignPresent = false;
            int sumRightValue = 0;
            while (textFromFile.hasMoreElements()) {
                String currentValue = (String)textFromFile.nextElement();
                if(currentValue.equals("=")) {
                    isEqualitySignPresent = true;
                    sumRightValue = Integer.parseInt((String)textFromFile.nextElement());
                    break;
                }
                else {
                    outputFileText += currentValue + " ";
                    sum += Integer.parseInt(currentValue);
                }
            }
            outputFileText += "= " + sum + "\n";
            if(isEqualitySignPresent && (sum != sumRightValue)) System.out.println("corrected " + index);

            index++;
        }
        inputFile.close();
        FileOutputStream outputFile = new FileOutputStream(path);
        outputFile.write(outputFileText.getBytes());
        outputFile.close();

    }
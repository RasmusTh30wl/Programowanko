    public static void displaySumOfNumersInLines( String path ) throws IOException {
        InputStream is = new FileInputStream(path);
        BufferedReader buf = new BufferedReader(new InputStreamReader(is));
        String line = buf.readLine();

        StringTokenizer textFromFile;
        while(line != null){
            StringBuilder sb = new StringBuilder();
            sb.append(line);
            textFromFile = new StringTokenizer(sb.toString());
            int number;
            int sum = 0;
            while (textFromFile.hasMoreElements()) {
                sum += Integer.parseInt((String)textFromFile.nextElement());

            }
            System.out.println(sum);
            line = buf.readLine();

        }

    }
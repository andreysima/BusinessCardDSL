/**
 * Created by gifarikautsar on 11/30/15.
 */

import BusinessCard
temp = new BusinessCard()

File input = new File("../input/input.txt");
BufferedReader br = new BufferedReader(new FileReader(input));

String namaPemilik = "";
String jabatan = "";
String email = "";
String noHandphone = "";
String namaPerusahaan = "";
String webPerusahaan = "";
String facebookUsername = "";
String twitterUsername = "";
String linkedIn = "";
String quote = "";

String line;
while ((line = br.readLine()) != null) {
    line = line.replaceAll("\\t+","");
    def word = line.split(" ", 2);
    
    if(word[0].equals("Owner")){
        namaPemilik = word[1];
    }
    if(word[0].equals("CompanyName")){
        namaPerusahaan = word[1];
    }
    if(word[0].equals("Position")){
        jabatan = word[1];
    }
    if(word[0].equals("CompanyWebsite")){
        webPerusahaan = word[1];
    }
    if(word[0].equals("Email")){
        email = word[1];
    }
    if(word[0].equals("PhoneNumber")){
        noHandphone = word[1];
    }
    if(word[0].equals("FacebookUsername")){
        facebookUsername = word[1];
    }
    if(word[0].equals("TwitterUsername")){
        twitterUsername = word[1];
    }
    if(word[0].equals("LinkedinUsername")){
        linkedIn = word[1];
    }
    if(word[0].equals("About")){
        quote = word[1];
    }
}

br.close();temp.doHtml(namaPemilik,
        jabatan,
        email,
        noHandphone,
        namaPerusahaan,
        webPerusahaan,
        facebookUsername,
        twitterUsername,
        linkedIn,
        quote)
Result re = new Result()
re.makeResult(temp.result)
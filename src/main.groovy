/**
 * Created by gifarikautsar on 11/30/15.
 */

import BusinessCard
temp = new BusinessCard()

File fin = new File("../input/input.txt")
BufferedReader br = new BufferedReader(new FileReader(fin));

String line = null;
i = 0

String namaPemilik
String jabatan
String email
String noHandphone
String namaPerusahaan
String webPerusahaan
String facebookUsername
String twitterUsername
String linkedIn
String result
String quote

while ((line = br.readLine()) != null) {
    i++
    line = line.replaceAll('\\t+', '');
    if(i == 4){
        namaPemilik = line
    }
    if(i == 5){
        jabatan = line
    }
    if(i == 7){
        namaPerusahaan = line
    }
    if(i == 8){
        webPerusahaan = line
    }
    if(i == 9){
        quote = line
    }
    if(i == 13){
        email = line
    }
    if(i == 14){
        noHandphone = line
    }
    if(i == 16){
        facebookUsername = line
    }
    if(i == 17){
        twitterUsername = line
    }
    if(i == 18){
        linkedIn = line
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
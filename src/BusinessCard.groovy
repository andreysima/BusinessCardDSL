import groovy.xml.MarkupBuilder

/**
 * Created by gifarikautsar on 11/30/15.
 */
class BusinessCard {
    // attributes
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

    public doHtml(String namaPemilik,
                  String jabatan,
                  String email,
                  String noHandphone,
                  String namaPerusahaan,
                  String webPerusahaan,
                  String facebookUsername,
                  String twitterUsername,
                  String linkedIn,
                  String quote) {
        def writer = new StringWriter()
        def xml = new MarkupBuilder(writer)
        xml.html(lang:"en") {
            head{
                meta (charset:"utf-8")
                meta (name:" viewport", content:"width= device-width; initial-scale: 1.0")
                meta(name:"description", content:"")
                meta(name:"author", content:"")
                link (rel:"shortcut icon", href:"assets/ico/favicon.png")

                title("${namaPemilik}")
                link(href:"assets/css/bootstrap.css", rel:"stylesheet")
                link(href:"assets/css/font-awesome.min.css", rel:"stylesheet")
                link(href:"assets/css/main.css", rel:"stylesheet")
                link(href:"http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic", rel:"stylesheet", type:"text/css")
                link(href:'http://fonts.googleapis.com/css?family=Raleway:400,300,700', rel:'stylesheet', type:'text/css')
            }
            body{
                div (class:"container"){
                    div (class:"col-lg-6 col-lg-offset-3"){
                        // Navigation
                        div (class:"row w"){
                            // Tab
                            div (class:"col-md-4"){
                                img class:"img-responsive", src:"assets/img/avatar.jpg", alt:""
                                ul (class:"nav nav-tabs nav-stacked", id:"myTab"){
                                    li (class:"active"){
                                        a href:"#about", "About"
                                    }
                                    li{
                                        a href:"#contact", "Contact"
                                    }
                                }
                            }
                            // Content
                            div (class:"col-md-8"){
                                div (class:"tab-content"){
                                    // First Tab
                                    div (class:"tab-pane active", id:"about"){
                                        h3 "${namaPemilik}"
                                        h5 "${jabatan} - ${namaPerusahaan}"
                                        hr{}
                                        br{}
                                        h2{
                                            center "${quote}"
                                        }
                                    }
                                    // Fourth Tab
                                    div (class:"tab-pane", id:"contact"){
                                        h4 "Contact Information"
                                        hr{}
                                        div (class:"row"){
                                            div (class:"col-xs-6"){
                                                p (class:"sm"){
                                                    i class:"icon-envelope" , " - ${email}"
                                                }
                                            }
                                            div (class:"col-xs-6"){
                                                p (class:"sm"){
                                                    i class:"icon-phone" , " - ${noHandphone}"
                                                    br{}
                                                }
                                            }
                                        }
                                        h4 "Social Links"
                                        hr{}
                                        div (class:"row"){
                                            div (class:"col-xs-6"){
                                                p (class:"sm"){
                                                    i class:"icon-facebook", " - "
                                                    a href:"https://www.facebook.com/${facebookUsername}", "${facebookUsername}"
                                                }
                                            }
                                            div (class:"col-xs-6"){
                                                p (class:"sm"){
                                                    i class:"icon-twitter", " - "
                                                    a href:"https://www.twitter.com/${twitterUsername}", "${twitterUsername}"
                                                }
                                            }
                                            div (class:"col-xs-6"){
                                                p (class:"sm"){
                                                    i class:"icon-user", " - "
                                                    a href:"https://www.linkedin.com/in/${linkedIn}", "${linkedIn}"
                                                }
                                            }
                                            div (class:"col-xs-6"){
                                                p (class:"sm"){
                                                    i class:"icon-briefcase", " - "
                                                    a href:"${webPerusahaan}", "${namaPerusahaan}"
                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
                script (src:"assets/js/jquery.js", "")
                script (src:"assets/js/bootstrap.min.js", "")
                script(
                        "\n\t\t\$(\'#myTab a\').click(function (e) {\n"+
                                "\t\t    e.preventDefault()\n" +
                                "\t\t    \$(this).tab(\'show\')\n" +
                                "\t\t})\n\t"
                )
            }
        }
        result = writer.toString()
    }
}


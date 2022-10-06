package com.example.guessthestar.date.stars.source.remote.downloadInfoText.jsoup.utils;

public class DocForFindNameLinkTest {
    public static String htmlDom = " </head>\n" +
            "<body class=\"mediawiki ltr sitedir-ltr mw-hide-empty-elt ns-0 ns-subject mw-editable page-AFI_s_100_Years_100_Stars rootpage-AFI_s_100_Years_100_Stars skin-vector action-view skin-vector-legacy vector-toc-not-collapsed vector-feature-language-in-header-enabled vector-feature-language-in-main-page-header-disabled vector-feature-language-alert-in-sidebar-enabled vector-feature-sticky-header-disabled vector-feature-sticky-header-edit-disabled vector-feature-table-of-contents-disabled vector-feature-visual-enhancement-next-disabled\"><div id=\"mw-page-base\" class=\"noprint\"></div>\n" +
            "<div id=\"mw-head-base\" class=\"noprint\"></div>\n" +
            "<div id=\"content\" class=\"mw-body\" role=\"main\">\n" +
            "\t<a id=\"top\"></a>\n" +
            "\t<div id=\"siteNotice\"><!-- CentralNotice --></div>\n" +
            "\t<div class=\"mw-indicators\">\n" +
            "\t</div>\n" +
            "\t<h1 id=\"firstHeading\" class=\"firstHeading mw-first-heading\"><span class=\"mw-page-title-main\">AFI's 100 Years...100 Stars</span></h1>\n" +
            "\t<div id=\"bodyContent\" class=\"vector-body\">\n" +
            "\t\t<div id=\"siteSub\" class=\"noprint\">From Wikipedia, the free encyclopedia</div>\n" +
            "\t\t<div id=\"contentSub\"></div>\n" +
            "\t\t<div id=\"contentSub2\"></div>\n" +
            "\t\t\n" +
            "\t\t<div id=\"jump-to-nav\"></div>\n" +
            "\t\t<a class=\"mw-jump-link\" href=\"#mw-head\">Jump to navigation</a>\n" +
            "\t\t<a class=\"mw-jump-link\" href=\"#searchInput\">Jump to search</a>\n" +
            "\t\t<div id=\"mw-content-text\" class=\"mw-body-content mw-content-ltr\" lang=\"en\" dir=\"ltr\"><div class=\"mw-parser-output\"><p class=\"mw-empty-elt\">\n" +
            "</p>\n" +
            "<style data-mw-deduplicate=\"TemplateStyles:r1066479718\">.mw-parser-output .infobox-subbox{padding:0;border:none;margin:-3px;width:auto;min-width:100%;font-size:100%;clear:none;float:none;background-color:transparent}.mw-parser-output .infobox-3cols-child{margin:auto}.mw-parser-output .infobox .navbar{font-size:100%}body.skin-minerva .mw-parser-output .infobox-header,body.skin-minerva .mw-parser-output .infobox-subheader,body.skin-minerva .mw-parser-output .infobox-above,body.skin-minerva .mw-parser-output .infobox-title,body.skin-minerva .mw-parser-output .infobox-image,body.skin-minerva .mw-parser-output .infobox-full-data,body.skin-minerva .mw-parser-output .infobox-below{text-align:center}</style><table class=\"infobox\"><caption class=\"infobox-title\"><a href=\"/wiki/AFI_100_Years..._series\" title=\"AFI 100 Years... series\">AFI 100 Years... series</a></caption><tbody><tr><th scope=\"row\" class=\"infobox-label\">1998</th><td class=\"infobox-data\"><i><b><a href=\"/wiki/AFI%27s_100_Years...100_Movies\" title=\"AFI&#39;s 100 Years...100 Movies\">100 Movies</a></b></i></td></tr><tr><th scope=\"row\" class=\"infobox-label\">1999</th><td class=\"infobox-data\"><i><b><a class=\"mw-selflink selflink\">100 Stars</a></b></i></td></tr><tr><th scope=\"row\" class=\"infobox-label\">2000</th><td class=\"infobox-data\"><i><b><a href=\"/wiki/AFI%27s_100_Years...100_Laughs\" title=\"AFI&#39;s 100 Years...100 Laughs\">100 Laughs</a></b></i></td></tr><tr><th scope=\"row\" class=\"infobox-label\">2001</th><td class=\"infobox-data\"><i><b><a href=\"/wiki/AFI%27s_100_Years...100_Thrills\" title=\"AFI&#39;s 100 Years...100 Thrills\">100 Thrills</a></b></i></td></tr><tr><th scope=\"row\" class=\"infobox-label\">2002</th><td class=\"infobox-data\"><i><b><a href=\"/wiki/AFI%27s_100_Years...100_Passions\" title=\"AFI&#39;s 100 Years...100 Passions\">100 Passions</a></b></i></td></tr><tr><th scope=\"row\" class=\"infobox-label\">2003</th><td class=\"infobox-data\"><i><b><a href=\"/wiki/AFI%27s_100_Years...100_Heroes_%26_Villains\" title=\"AFI&#39;s 100 Years...100 Heroes &amp; Villains\">100 Heroes &amp; Villains</a></b></i></td></tr><tr><th scope=\"row\" class=\"infobox-label\">2004</th><td class=\"infobox-data\"><i><b><a href=\"/wiki/AFI%27s_100_Years...100_Songs\" title=\"AFI&#39;s 100 Years...100 Songs\">100 Songs</a></b></i></td></tr><tr><th scope=\"row\" class=\"infobox-label\">2005</th><td class=\"infobox-data\"><i><b><a href=\"/wiki/AFI%27s_100_Years...100_Movie_Quotes\" title=\"AFI&#39;s 100 Years...100 Movie Quotes\">100 Movie Quotes</a></b></i></td></tr><tr><th scope=\"row\" class=\"infobox-label\">2005</th><td class=\"infobox-data\"><i><b><a href=\"/wiki/AFI%27s_100_Years_of_Film_Scores\" title=\"AFI&#39;s 100 Years of Film Scores\">25 Scores</a></b></i></td></tr><tr><th scope=\"row\" class=\"infobox-label\">2006</th><td class=\"infobox-data\"><i><b><a href=\"/wiki/AFI%27s_100_Years...100_Cheers\" title=\"AFI&#39;s 100 Years...100 Cheers\">100 Cheers</a></b></i></td></tr><tr><th scope=\"row\" class=\"infobox-label\">2006</th><td class=\"infobox-data\"><i><b><a href=\"/wiki/AFI%27s_Greatest_Movie_Musicals\" title=\"AFI&#39;s Greatest Movie Musicals\">25 Musicals</a></b></i></td></tr><tr><th scope=\"row\" class=\"infobox-label\">2007</th><td class=\"infobox-data\"><i><b><a href=\"/wiki/AFI%27s_100_Years...100_Movies_(10th_Anniversary_Edition)\" title=\"AFI&#39;s 100 Years...100 Movies (10th Anniversary Edition)\">100 Movies (Updated)</a></b></i></td></tr><tr><th scope=\"row\" class=\"infobox-label\">2008</th><td class=\"infobox-data\"><i><b><a href=\"/wiki/AFI%27s_10_Top_10\" title=\"AFI&#39;s 10 Top 10\">AFI's 10 Top 10</a></b></i></td></tr><tr><td colspan=\"2\" class=\"infobox-navbar\"><style data-mw-deduplicate=\"TemplateStyles:r1063604349\">.mw-parser-output .navbar{display:inline;font-size:88%;font-weight:normal}.mw-parser-output .navbar-collapse{float:left;text-align:left}.mw-parser-output .navbar-boxtext{word-spacing:0}.mw-parser-output .navbar ul{display:inline-block;white-space:nowrap;line-height:inherit}.mw-parser-output .navbar-brackets::before{margin-right:-0.125em;content:\"[ \"}.mw-parser-output .navbar-brackets::after{margin-left:-0.125em;content:\" ]\"}.mw-parser-output .navbar li{word-spacing:-0.125em}.mw-parser-output .navbar a>span,.mw-parser-output .navbar a>abbr{text-decoration:inherit}.mw-parser-output .navbar-mini abbr{font-variant:small-caps;border-bottom:none;text-decoration:none;cursor:inherit}.mw-parser-output .navbar-ct-full{font-size:114%;margin:0 7em}.mw-parser-output .navbar-ct-mini{font-size:114%;margin:0 4em}</style><div class=\"navbar plainlinks hlist navbar-mini\"><ul><li class=\"nv-view\"><a href=\"/wiki/Template:AFI_100_Years..._series\" title=\"Template:AFI 100 Years... series\"><abbr title=\"View this template\">v</abbr></a></li><li class=\"nv-talk\"><a href=\"/wiki/Template_talk:AFI_100_Years..._series\" title=\"Template talk:AFI 100 Years... series\"><abbr title=\"Discuss this template\">t</abbr></a></li><li class=\"nv-edit\"><a class=\"external text\" href=\"https://en.wikipedia.org/w/index.php?title=Template:AFI_100_Years..._series&amp;action=edit\"><abbr title=\"Edit this template\">e</abbr></a></li></ul></div></td></tr></tbody></table><p><b>AFI's 100 Years...100 Stars</b> is the <a href=\"/wiki/American_Film_Institute\" title=\"American Film Institute\">American Film Institute</a>'s list ranking the top 25 female and 25 male greatest screen legends of <a href=\"/wiki/Cinema_of_the_United_States\" title=\"Cinema of the United States\">American film history</a> and is the second list of the <a href=\"/wiki/AFI_100_Years..._series\" title=\"AFI 100 Years... series\">AFI 100 Years... series</a>. \n" +
            "</p><p>The list was unveiled through a <a href=\"/wiki/CBS\" title=\"CBS\">CBS</a> special on June 15, 1999, hosted by <a href=\"/wiki/Shirley_Temple\" title=\"Shirley Temple\">Shirley Temple</a> (who is herself honored on the female legends list), with 50 then-current actors making the presentations.<sup id=\"cite_ref-afi_1-0\" class=\"reference\"><a href=\"#cite_note-afi-1\">&#91;1&#93;</a></sup>\n" +
            "</p><p>AFI defines an \"American screen legend\" as \"an actor or a team of actors with a significant screen presence in American <a href=\"/wiki/Feature_film\" title=\"Feature film\">feature-length films</a> (films of 40 minutes or more) whose screen debut occurred in or before 1950, or whose screen debut occurred after 1950 but whose death has marked a completed body of work.\" In other words, the list generally honors actors recognized for their contributions to <a href=\"/wiki/Classical_Hollywood_cinema\" title=\"Classical Hollywood cinema\">classical Hollywood cinema</a>.<sup id=\"cite_ref-afi_1-1\" class=\"reference\"><a href=\"#cite_note-afi-1\">&#91;1&#93;</a></sup> Jurors selected the final lists from 250 female and 250 male nominees.<sup id=\"cite_ref-:0_2-0\" class=\"reference\"><a href=\"#cite_note-:0-2\">&#91;2&#93;</a></sup>\n" +
            "</p><p>The top stars of their respective gender are <a href=\"/wiki/Katharine_Hepburn\" title=\"Katharine Hepburn\">Katharine Hepburn</a> and <a href=\"/wiki/Humphrey_Bogart\" title=\"Humphrey Bogart\">Humphrey Bogart</a>, who starred together in the classic adventure 1951 film <i><a href=\"/wiki/The_African_Queen_(film)\" title=\"The African Queen (film)\">The African Queen</a></i>.\n" +
            "</p><p>Seventeen female stars were born in the United States; the other nine are <a href=\"/wiki/Vivien_Leigh\" title=\"Vivien Leigh\">Vivien Leigh</a> and <a href=\"/wiki/Elizabeth_Taylor\" title=\"Elizabeth Taylor\">Elizabeth Taylor</a>, born in <a href=\"/wiki/India\" title=\"India\">India</a> and the <a href=\"/wiki/United_Kingdom\" title=\"United Kingdom\">United Kingdom</a>, respectively, <a href=\"/wiki/Audrey_Hepburn\" title=\"Audrey Hepburn\">Audrey Hepburn</a>, born in Belgium, <a href=\"/wiki/Mary_Pickford\" title=\"Mary Pickford\">Mary Pickford</a> born in Canada, <a href=\"/wiki/Marlene_Dietrich\" title=\"Marlene Dietrich\">Marlene Dietrich</a>, born in Germany, <a href=\"/wiki/Sophia_Loren\" title=\"Sophia Loren\">Sophia Loren</a>, born in Italy, <a href=\"/wiki/Claudette_Colbert\" title=\"Claudette Colbert\">Claudette Colbert</a>, born in France, and <a href=\"/wiki/Ingrid_Bergman\" title=\"Ingrid Bergman\">Ingrid Bergman</a> &amp; <a href=\"/wiki/Greta_Garbo\" title=\"Greta Garbo\">Greta Garbo</a>, born in Sweden.\n" +
            "</p><p>Twenty-one male stars were born in the United States; the other four are <a href=\"/wiki/Charlie_Chaplin\" title=\"Charlie Chaplin\">Charlie Chaplin</a>, <a href=\"/wiki/Laurence_Olivier\" title=\"Laurence Olivier\">Laurence Olivier</a> and <a href=\"/wiki/Cary_Grant\" title=\"Cary Grant\">Cary Grant</a>, who were born in the <a href=\"/wiki/United_Kingdom\" title=\"United Kingdom\">United Kingdom</a>, and <a href=\"/wiki/Edward_G._Robinson\" title=\"Edward G. Robinson\">Edward G. Robinson</a>, born in <a href=\"/wiki/Romania\" title=\"Romania\">Romania</a>.\n" +
            "</p><p>At the time that the lists were unveiled, <a href=\"/wiki/Gregory_Peck\" title=\"Gregory Peck\">Gregory Peck</a>, <a href=\"/wiki/Katharine_Hepburn\" title=\"Katharine Hepburn\">Katharine Hepburn</a>, <a href=\"/wiki/Marlon_Brando\" title=\"Marlon Brando\">Marlon Brando</a>, <a href=\"/wiki/Elizabeth_Taylor\" title=\"Elizabeth Taylor\">Elizabeth Taylor</a>, <a href=\"/wiki/Shirley_Temple\" title=\"Shirley Temple\">Shirley Temple</a>, <a href=\"/wiki/Lauren_Bacall\" title=\"Lauren Bacall\">Lauren Bacall</a>, <a href=\"/wiki/Kirk_Douglas\" title=\"Kirk Douglas\">Kirk Douglas</a> (the longest-lived star at 103) and <a href=\"/wiki/Sidney_Poitier\" title=\"Sidney Poitier\">Sidney Poitier</a> were all still living, but they have since died. As of October 2022, at 88, <a href=\"/wiki/Sophia_Loren\" title=\"Sophia Loren\">Sophia Loren</a> is the only surviving honoree.<sup id=\"cite_ref-afi_1-2\" class=\"reference\"><a href=\"#cite_note-afi-1\">&#91;1&#93;</a></sup>\n" +
            "</p>\n" +
            "<div id=\"toc\" class=\"toc\" role=\"navigation\" aria-labelledby=\"mw-toc-heading\"><input type=\"checkbox\" role=\"button\" id=\"toctogglecheckbox\" class=\"toctogglecheckbox\" style=\"display:none\" /><div class=\"toctitle\" lang=\"en\" dir=\"ltr\"><h2 id=\"mw-toc-heading\">Contents</h2><span class=\"toctogglespan\"><label class=\"toctogglelabel\" for=\"toctogglecheckbox\"></label></span></div>\n" +
            "<ul>\n" +
            "<li class=\"toclevel-1 tocsection-1\"><a href=\"#List_of_50_greatest_screen_legends:_Top_25_Female_and_Top_25_Male_stars\"><span class=\"tocnumber\">1</span> <span class=\"toctext\">List of 50 greatest screen legends: Top 25 Female and Top 25 Male stars</span></a></li>\n" +
            "<li class=\"toclevel-1 tocsection-2\"><a href=\"#Nominees\"><span class=\"tocnumber\">2</span> <span class=\"toctext\">Nominees</span></a>\n" +
            "<ul>\n" +
            "<li class=\"toclevel-2 tocsection-3\"><a href=\"#The_250_female_nominees\"><span class=\"tocnumber\">2.1</span> <span class=\"toctext\">The 250 female nominees</span></a></li>\n" +
            "<li class=\"toclevel-2 tocsection-4\"><a href=\"#The_250_male_nominees\"><span class=\"tocnumber\">2.2</span> <span class=\"toctext\">The 250 male nominees</span></a></li>\n" +
            "</ul>\n" +
            "</li>\n" +
            "<li class=\"toclevel-1 tocsection-5\"><a href=\"#References\"><span class=\"tocnumber\">3</span> <span class=\"toctext\">References</span></a></li>\n" +
            "<li class=\"toclevel-1 tocsection-6\"><a href=\"#External_links\"><span class=\"tocnumber\">4</span> <span class=\"toctext\">External links</span></a></li>\n" +
            "</ul>\n" +
            "</div>\n" +
            "\n" +
            "<h2><span class=\"mw-headline\" id=\"List_of_50_greatest_screen_legends:_Top_25_Female_and_Top_25_Male_stars\">List of 50 greatest screen legends: Top 25 Female and Top 25 Male stars</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=AFI%27s_100_Years...100_Stars&amp;action=edit&amp;section=1\" title=\"Edit section: List of 50 greatest screen legends: Top 25 Female and Top 25 Male stars\">edit</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n" +
            "<table class=\"wikitable sortable\" style=\"font-size:1.00em; line-height:1.5em;\">\n" +
            "<tbody><tr>\n" +
            "<th style=\"width: 2%;\">No.\n" +
            "</th>\n" +
            "<th colspan=\"3\">Female legends\n" +
            "</th>\n" +
            "<th colspan=\"3\">Male legends\n" +
            "</th></tr>\n" +
            "<tr>\n" +
            "<td>1\n" +
            "</td>\n" +
            "<td style=\"width: 5%;\"><a href=\"/wiki/Katharine_Hepburn\" title=\"Katharine Hepburn\">Katharine Hepburn</a>\n" +
            "<p><small>(1907–2003)</small>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td style=\"width: 5%;\"><a href=\"/wiki/File:Katharine_Hepburn_promo_pic.jpg\" class=\"image\"><img alt=\"Katharine Hepburn promo pic.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/0/08/Katharine_Hepburn_promo_pic.jpg/100px-Katharine_Hepburn_promo_pic.jpg\" decoding=\"async\" width=\"100\" height=\"125\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/0/08/Katharine_Hepburn_promo_pic.jpg/150px-Katharine_Hepburn_promo_pic.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/0/08/Katharine_Hepburn_promo_pic.jpg/199px-Katharine_Hepburn_promo_pic.jpg 2x\" data-file-width=\"2100\" data-file-height=\"2632\" /></a>\n" +
            "</td>\n" +
            "<td style=\"width: 39%;\">Known for:\n" +
            "<p><i><a href=\"/wiki/Little_Women_(1933_film)\" title=\"Little Women (1933 film)\">Little Women</a></i> (1933)\n" +
            "</p><p><i><a href=\"/wiki/Alice_Adams_(1935_film)\" title=\"Alice Adams (1935 film)\">Alice Adams</a></i> (1935)\n" +
            "</p><p><i><a href=\"/wiki/Stage_Door\" title=\"Stage Door\">Stage Door</a></i> (1937)\n" +
            "</p><p><i><a href=\"/wiki/Bringing_Up_Baby\" title=\"Bringing Up Baby\">Bringing Up Baby</a></i> (1938)\n" +
            "</p><p><i><a href=\"/wiki/The_Philadelphia_Story_(film)\" title=\"The Philadelphia Story (film)\">The Philadelphia Story</a></i> (1940)\n" +
            "</p><p><i><a href=\"/wiki/Woman_of_the_Year\" title=\"Woman of the Year\">Woman of the Year</a></i> (1942)\n" +
            "</p><p><i><a href=\"/wiki/The_African_Queen_(film)\" title=\"The African Queen (film)\">The African Queen</a></i> (1951)\n" +
            "</p><p><i><a href=\"/wiki/Long_Day%27s_Journey_Into_Night_(1962_film)\" class=\"mw-redirect\" title=\"Long Day&#39;s Journey Into Night (1962 film)\">Long Day's Journey Into Night</a></i> (1962)\n" +
            "</p><p><i><a href=\"/wiki/Guess_Who%27s_Coming_to_Dinner\" title=\"Guess Who&#39;s Coming to Dinner\">Guess Who's Coming to Dinner</a></i> (1967)\n" +
            "</p><p><i><a href=\"/wiki/The_Lion_in_Winter_(1968_film)\" title=\"The Lion in Winter (1968 film)\">The Lion in Winter</a></i> (1968)\n" +
            "</p><p>Nominated for 12 Academy Awards, won for <i><a href=\"/wiki/Morning_Glory_(1933_film)\" title=\"Morning Glory (1933 film)\">Morning Glory</a></i> (1933), <i><a href=\"/wiki/Guess_Who%27s_Coming_to_Dinner\" title=\"Guess Who&#39;s Coming to Dinner\">Guess Who's Coming to Dinner</a></i> (1967), <a href=\"/wiki/The_Lion_in_Winter_(1968_film)\" title=\"The Lion in Winter (1968 film)\"><i>The Lion in Winter</i></a> (1968), and <i><a href=\"/wiki/On_Golden_Pond_(1981_film)\" title=\"On Golden Pond (1981 film)\">On Golden Pond</a></i> (1981).\n" +
            "</p>\n" +
            "</td>\n" +
            "<td style=\"width: 5%;\"><a href=\"/wiki/Humphrey_Bogart\" title=\"Humphrey Bogart\">Humphrey Bogart</a> <small>(1899–1957)</small>\n" +
            "</td>\n" +
            "<td style=\"width: 5%;\"><a href=\"/wiki/File:Humphrey_Bogart_1940.jpg\" class=\"image\"><img alt=\"Humphrey Bogart 1940.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/8/84/Humphrey_Bogart_1940.jpg/100px-Humphrey_Bogart_1940.jpg\" decoding=\"async\" width=\"100\" height=\"142\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/8/84/Humphrey_Bogart_1940.jpg/150px-Humphrey_Bogart_1940.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/8/84/Humphrey_Bogart_1940.jpg/200px-Humphrey_Bogart_1940.jpg 2x\" data-file-width=\"527\" data-file-height=\"746\" /></a>\n" +
            "</td>\n" +
            "<td style=\"width: 39%;\">Known for:\n" +
            "<p><i><a href=\"/wiki/The_Petrified_Forest\" title=\"The Petrified Forest\">The Petrified Forest</a></i> (1936)\n" +
            "</p><p><i><a href=\"/wiki/The_Maltese_Falcon_(1941_film)\" title=\"The Maltese Falcon (1941 film)\">The Maltese Falcon</a></i> (1941)\n" +
            "</p><p><i><a href=\"/wiki/Casablanca_(film)\" title=\"Casablanca (film)\">Casablanca</a></i> (1942)\n" +
            "</p><p><i><a href=\"/wiki/To_Have_and_Have_Not_(film)\" title=\"To Have and Have Not (film)\">To Have and Have Not</a></i> (1944)\n" +
            "</p><p><i><a href=\"/wiki/The_Big_Sleep_(1946_film)\" title=\"The Big Sleep (1946 film)\">The Big Sleep</a></i> (1946)\n" +
            "</p><p><i><a href=\"/wiki/Dark_Passage_(film)\" title=\"Dark Passage (film)\">Dark Passage</a></i> (1947)\n" +
            "</p><p><i><a href=\"/wiki/The_Treasure_of_the_Sierra_Madre_(film)\" title=\"The Treasure of the Sierra Madre (film)\">The Treasure of the Sierra Madre</a></i> (1948)\n" +
            "</p><p><i><a href=\"/wiki/Key_Largo_(film)\" title=\"Key Largo (film)\">Key Largo</a></i> (1948)\n" +
            "</p><p><i><a href=\"/wiki/In_a_Lonely_Place\" title=\"In a Lonely Place\">In a Lonely Place</a></i> (1950)\n" +
            "</p><p><i><a href=\"/wiki/The_African_Queen_(film)\" title=\"The African Queen (film)\">The African Queen</a></i> (1951)\n" +
            "</p><p><i><a href=\"/wiki/The_Caine_Mutiny_(film)\" title=\"The Caine Mutiny (film)\">The Caine Mutiny</a></i> (1954)\n" +
            "</p><p>Nominated for three <a href=\"/wiki/Academy_Awards\" title=\"Academy Awards\">Academy Awards</a>, won for <i>The African Queen</i>.\n" +
            "</p>\n" +
            "</td></tr>\n" +
            "<tr>\n" +
            "<td>2\n" +
            "</td>\n" +
            "<td><a href=\"/wiki/Bette_Davis\" title=\"Bette Davis\">Bette Davis</a>\n" +
            "<p><small>(1908–1989)</small>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td><a href=\"/wiki/File:Jezebel-1938-Bette-Davis-cropped.jpg\" class=\"image\"><img alt=\"Jezebel-1938-Bette-Davis-cropped.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/a/ac/Jezebel-1938-Bette-Davis-cropped.jpg/100px-Jezebel-1938-Bette-Davis-cropped.jpg\" decoding=\"async\" width=\"100\" height=\"140\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/a/ac/Jezebel-1938-Bette-Davis-cropped.jpg/150px-Jezebel-1938-Bette-Davis-cropped.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/a/ac/Jezebel-1938-Bette-Davis-cropped.jpg/200px-Jezebel-1938-Bette-Davis-cropped.jpg 2x\" data-file-width=\"478\" data-file-height=\"670\" /></a>\n" +
            "</td>\n" +
            "<td>Known for:\n" +
            "<p><i><a href=\"/wiki/Of_Human_Bondage_(1934_film)\" title=\"Of Human Bondage (1934 film)\">Of Human Bondage</a></i> (1934)\n" +
            "</p><p><i><a href=\"/wiki/The_Petrified_Forest\" title=\"The Petrified Forest\">The Petrified Forest</a></i> (1936)\n" +
            "</p><p><i><a href=\"/wiki/Jezebel_(1938_film)\" title=\"Jezebel (1938 film)\">Jezebel</a></i> (1938)\n" +
            "</p><p><i><a href=\"/wiki/Dark_Victory\" title=\"Dark Victory\">Dark Victory</a></i> (1939)\n" +
            "</p><p><i><a href=\"/wiki/The_Letter_(1940_film)\" title=\"The Letter (1940 film)\">The Letter</a></i> (1940)\n" +
            "</p><p><i><a href=\"/wiki/The_Little_Foxes_(film)\" title=\"The Little Foxes (film)\">The Little Foxes</a></i> (1941)\n" +
            "</p><p><i><a href=\"/wiki/All_About_Eve\" title=\"All About Eve\">All About Eve</a></i> (1950)\n" +
            "</p><p><i><a href=\"/wiki/What_Ever_Happened_to_Baby_Jane%3F_(film)\" title=\"What Ever Happened to Baby Jane? (film)\">What Ever Happened to Baby Jane?</a></i> (1962)\n" +
            "</p><p>Nominated for 11 Academy Awards, won for <i><a href=\"/wiki/Dangerous_(1935_film)\" title=\"Dangerous (1935 film)\">Dangerous</a></i>, and <i>Jezebel</i>.\n" +
            "</p>\n" +
            "</td>\n" +
            "<td><a href=\"/wiki/Cary_Grant\" title=\"Cary Grant\">Cary Grant</a>\n" +
            "<p><small>(1904–1986)</small>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td><a href=\"/wiki/File:Grant,_Cary_(Suspicion)_01_Crisco_edit.jpg\" class=\"image\"><img alt=\"Grant, Cary (Suspicion) 01 Crisco edit.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/27/Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg/100px-Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg\" decoding=\"async\" width=\"100\" height=\"129\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/27/Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg/150px-Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/2/27/Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg/199px-Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg 2x\" data-file-width=\"1699\" data-file-height=\"2200\" /></a>\n" +
            "</td>\n" +
            "<td>Known for:\n" +
            "<p><i><a href=\"/wiki/The_Awful_Truth\" title=\"The Awful Truth\">The Awful Truth</a></i> (1937)\n" +
            "</p><p><i><a href=\"/wiki/Bringing_Up_Baby\" title=\"Bringing Up Baby\">Bringing Up Baby</a></i> (1938)\n" +
            "</p><p><i><a href=\"/wiki/Only_Angels_Have_Wings\" title=\"Only Angels Have Wings\">Only Angels Have Wings</a></i> (1939)\n" +
            "</p><p><i><a href=\"/wiki/His_Girl_Friday\" title=\"His Girl Friday\">His Girl Friday</a></i> (1940)\n" +
            "</p><p><i><a href=\"/wiki/The_Philadelphia_Story_(film)\" title=\"The Philadelphia Story (film)\">The Philadelphia Story</a></i> (1940)\n" +
            "</p><p><i><a href=\"/wiki/Notorious_(1946_film)\" title=\"Notorious (1946 film)\">Notorious</a></i> (1946)\n" +
            "</p><p><i><a href=\"/wiki/An_Affair_to_Remember\" title=\"An Affair to Remember\">An Affair to Remember</a></i> (1957)\n" +
            "</p><p><i><a href=\"/wiki/North_by_Northwest\" title=\"North by Northwest\">North by Northwest</a></i> (1959)\n" +
            "</p><p>Nominated for two Academy Awards, earned <a href=\"/wiki/Academy_Honorary_Award\" title=\"Academy Honorary Award\">Academy Honorary Award</a> in 1970\n" +
            "</p>\n" +
            "</td></tr>\n" +
            "<tr>\n" +
            "<td>3" +
            "" +
            "" +
            "" +
            "" +


            //////////////////////////////
            //// .....................
            //////////////////////////////


            "" +
            "" +
            "<tr>\n" +
            "<td>23\n" +
            "</td>\n" +
            "<td><span data-sort-value=\"Lombard, Carole\"><span class=\"vcard\"><span class=\"fn\"><a href=\"/wiki/Carole_Lombard\" title=\"Carole Lombard\">Carole Lombard</a></span></span></span>\n" +
            "<p><small>(1908–1942)</small>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td><a href=\"/wiki/File:Carole_Lombard_-_Paramount.JPG\" class=\"image\"><img alt=\"Carole Lombard - Paramount.JPG\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Carole_Lombard_-_Paramount.JPG/100px-Carole_Lombard_-_Paramount.JPG\" decoding=\"async\" width=\"100\" height=\"129\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Carole_Lombard_-_Paramount.JPG/150px-Carole_Lombard_-_Paramount.JPG 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Carole_Lombard_-_Paramount.JPG/200px-Carole_Lombard_-_Paramount.JPG 2x\" data-file-width=\"1201\" data-file-height=\"1547\" /></a>\n" +
            "</td>\n" +
            "<td>Known for:\n" +
            "<p><i><a href=\"/wiki/Hands_Across_the_Table\" title=\"Hands Across the Table\">Hands Across the Table</a></i> (1935)\n" +
            "</p><p><i><a href=\"/wiki/My_Man_Godfrey\" title=\"My Man Godfrey\">My Man Godfrey</a></i> (1936)\n" +
            "</p><p><i><a href=\"/wiki/Mr._%26_Mrs._Smith_(1941_film)\" title=\"Mr. &amp; Mrs. Smith (1941 film)\">Mr. &amp; Mrs. Smith</a></i> (1941)\n" +
            "</p><p><i><a href=\"/wiki/To_Be_or_Not_to_Be_(1942_film)\" title=\"To Be or Not to Be (1942 film)\">To Be or Not to Be</a></i> (1942)\n" +
            "</p><p>Nominated for one Academy Award.\n" +
            "</p>\n" +
            "</td>\n" +
            "<td><span data-sort-value=\"Mitchum, Robert\"><span class=\"vcard\"><span class=\"fn\"><a href=\"/wiki/Robert_Mitchum\" title=\"Robert Mitchum\">Robert Mitchum</a></span></span></span>\n" +
            "<p><small>(1917–1997)</small>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td><a href=\"/wiki/File:Robert_Mitchum_1949_(no_signature).jpg\" class=\"image\"><img alt=\"Robert Mitchum 1949 (no signature).jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Robert_Mitchum_1949_%28no_signature%29.jpg/100px-Robert_Mitchum_1949_%28no_signature%29.jpg\" decoding=\"async\" width=\"100\" height=\"126\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Robert_Mitchum_1949_%28no_signature%29.jpg/150px-Robert_Mitchum_1949_%28no_signature%29.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Robert_Mitchum_1949_%28no_signature%29.jpg/200px-Robert_Mitchum_1949_%28no_signature%29.jpg 2x\" data-file-width=\"564\" data-file-height=\"709\" /></a>\n" +
            "</td>\n" +
            "<td>Known for:\n" +
            "<p><i><a href=\"/wiki/Out_of_the_Past\" title=\"Out of the Past\">Out of the Past</a></i> (1947)\n" +
            "</p><p><i><a href=\"/wiki/The_Night_of_the_Hunter_(film)\" title=\"The Night of the Hunter (film)\">The Night of the Hunter</a></i> (1955)\n" +
            "</p><p><i><a href=\"/wiki/Cape_Fear_(1962_film)\" title=\"Cape Fear (1962 film)\">Cape Fear</a></i> (1962)\n" +
            "</p><p><i><a href=\"/wiki/Ryan%27s_Daughter\" title=\"Ryan&#39;s Daughter\">Ryan's Daughter</a></i> (1970)\n" +
            "</p><p>Nominated for one Academy Award\n" +
            "</p>\n" +
            "</td></tr>\n" +
            "<tr>\n" +
            "<td>24\n" +
            "</td>\n" +
            "<td><span data-sort-value=\"Pickford, Mary\"><span class=\"vcard\"><span class=\"fn\"><a href=\"/wiki/Mary_Pickford\" title=\"Mary Pickford\">Mary Pickford</a></span></span></span>\n" +
            "<p><small>(1892–1979)</small>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td><a href=\"/wiki/File:Mary_Pickford_cph.3c17995u.jpg\" class=\"image\"><img alt=\"Mary Pickford cph.3c17995u.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/8/88/Mary_Pickford_cph.3c17995u.jpg/100px-Mary_Pickford_cph.3c17995u.jpg\" decoding=\"async\" width=\"100\" height=\"127\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/8/88/Mary_Pickford_cph.3c17995u.jpg/150px-Mary_Pickford_cph.3c17995u.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/8/88/Mary_Pickford_cph.3c17995u.jpg/200px-Mary_Pickford_cph.3c17995u.jpg 2x\" data-file-width=\"2934\" data-file-height=\"3726\" /></a>\n" +
            "</td>\n" +
            "<td>Known for:\n" +
            "<p><i><a href=\"/wiki/Hearts_Adrift\" title=\"Hearts Adrift\">Hearts Adrift</a></i> (1914)\n" +
            "</p><p><i><a href=\"/wiki/Pollyanna_(1920_film)\" title=\"Pollyanna (1920 film)\">Pollyanna</a></i> (1920)\n" +
            "</p><p><i><a href=\"/wiki/My_Best_Girl_(1927_film)\" title=\"My Best Girl (1927 film)\">My Best Girl</a></i> (1927)\n" +
            "</p><p><i><a href=\"/wiki/Coquette_(film)\" title=\"Coquette (film)\">Coquette</a></i> (1929)\n" +
            "</p><p>Won Academy Award for <i>Coquette</i>, earned Academy Honorary Award in 1976.\n" +
            "</p>\n" +
            "</td>\n" +
            "<td><span data-sort-value=\"Robinson, Edward G.\"><span class=\"vcard\"><span class=\"fn\"><a href=\"/wiki/Edward_G._Robinson\" title=\"Edward G. Robinson\">Edward G. Robinson</a></span></span></span>\n" +
            "<p><small>(1893–1973)</small>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td><a href=\"/wiki/File:Edward_G._Robinson_1948.jpg\" class=\"image\"><img alt=\"Edward G. Robinson 1948.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Edward_G._Robinson_1948.jpg/100px-Edward_G._Robinson_1948.jpg\" decoding=\"async\" width=\"100\" height=\"127\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Edward_G._Robinson_1948.jpg/151px-Edward_G._Robinson_1948.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Edward_G._Robinson_1948.jpg/200px-Edward_G._Robinson_1948.jpg 2x\" data-file-width=\"1868\" data-file-height=\"2369\" /></a>\n" +
            "</td>\n" +
            "<td>Known for:\n" +
            "<p><i><a href=\"/wiki/Little_Caesar_(film)\" title=\"Little Caesar (film)\">Little Caesar</a></i> (1931)\n" +
            "</p><p><i><a href=\"/wiki/Double_Indemnity\" title=\"Double Indemnity\">Double Indemnity</a></i> (1944)\n" +
            "</p><p><i><a href=\"/wiki/Key_Largo_(film)\" title=\"Key Largo (film)\">Key Largo</a></i> (1948)\n" +
            "</p><p><i><a href=\"/wiki/The_Ten_Commandments_(1956_film)\" title=\"The Ten Commandments (1956 film)\">The Ten Commandments</a></i> (1956)\n" +
            "</p><p>Posthumously earned Academy Honorary Award in 1973.\n" +
            "</p>\n" +
            "</td></tr>\n" +
            "<tr>\n" +
            "<td>25\n" +
            "</td>\n" +
            "<td><span data-sort-value=\"Gardner, Ava\"><span class=\"vcard\"><span class=\"fn\"><a href=\"/wiki/Ava_Gardner\" title=\"Ava Gardner\">Ava Gardner</a></span></span></span>\n" +
            "<p><small>(1922–1990)</small>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td><a href=\"/wiki/File:Ava_Gardner_Show_Boat_1951.jpg\" class=\"image\"><img alt=\"Ava Gardner Show Boat 1951.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/29/Ava_Gardner_Show_Boat_1951.jpg/100px-Ava_Gardner_Show_Boat_1951.jpg\" decoding=\"async\" width=\"100\" height=\"128\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/29/Ava_Gardner_Show_Boat_1951.jpg/150px-Ava_Gardner_Show_Boat_1951.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/2/29/Ava_Gardner_Show_Boat_1951.jpg/200px-Ava_Gardner_Show_Boat_1951.jpg 2x\" data-file-width=\"702\" data-file-height=\"899\" /></a>\n" +
            "</td>\n" +
            "<td>Known for:\n" +
            "<p><i><a href=\"/wiki/The_Killers_(1946_film)\" title=\"The Killers (1946 film)\">The Killers</a></i> (1946)\n" +
            "</p><p><i><a href=\"/wiki/Show_Boat_(1951_film)\" title=\"Show Boat (1951 film)\">Show Boat</a></i> (1951)\n" +
            "</p><p><i><a href=\"/wiki/Mogambo\" title=\"Mogambo\">Mogambo</a></i> (1953)\n" +
            "</p><p><i><a href=\"/wiki/The_Barefoot_Contessa\" title=\"The Barefoot Contessa\">The Barefoot Contessa</a></i> (1954)\n" +
            "</p><p><i><a href=\"/wiki/The_Night_of_the_Iguana_(film)\" title=\"The Night of the Iguana (film)\">The Night of the Iguana</a></i> (1964)\n" +
            "</p><p>Nominated for one Academy Award.\n" +
            "</p>\n" +
            "</td>\n" +
            "<td><span data-sort-value=\"Holden, William\"><span class=\"vcard\"><span class=\"fn\"><a href=\"/wiki/William_Holden\" title=\"William Holden\">William Holden</a></span></span></span>\n" +
            "<p><small>(1918–1981)</small>\n" +
            "</p>\n" +
            "</td>\n" +
            "<td><a href=\"/wiki/File:Holden-portrait.jpg\" class=\"image\"><img alt=\"Holden-portrait.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Holden-portrait.jpg/100px-Holden-portrait.jpg\" decoding=\"async\" width=\"100\" height=\"123\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Holden-portrait.jpg/150px-Holden-portrait.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Holden-portrait.jpg/199px-Holden-portrait.jpg 2x\" data-file-width=\"1004\" data-file-height=\"1238\" /></a>\n" +
            "</td>\n" +
            "<td>Known for:\n" +
            "<p><i><a href=\"/wiki/Sunset_Boulevard_(film)\" title=\"Sunset Boulevard (film)\">Sunset Boulevard</a></i> (1950)\n" +
            "</p><p><i><a href=\"/wiki/Born_Yesterday_(1950_film)\" title=\"Born Yesterday (1950 film)\">Born Yesterday</a></i> (1950)\n" +
            "</p><p><i><a href=\"/wiki/Stalag_17\" title=\"Stalag 17\">Stalag 17</a></i> (1953)\n" +
            "</p><p><i><a href=\"/wiki/Sabrina_(1954_film)\" title=\"Sabrina (1954 film)\">Sabrina</a></i> (1954)\n" +
            "</p><p><i><a href=\"/wiki/Picnic_(1955_film)\" title=\"Picnic (1955 film)\">Picnic</a></i> (1955)\n" +
            "</p><p><i><a href=\"/wiki/The_Bridge_on_the_River_Kwai\" title=\"The Bridge on the River Kwai\">The Bridge on the River Kwai</a></i> (1957)\n" +
            "</p><p><i><a href=\"/wiki/The_Wild_Bunch\" title=\"The Wild Bunch\">The Wild Bunch</a></i> (1969)\n" +
            "</p><p><i><a href=\"/wiki/Network_(1976_film)\" title=\"Network (1976 film)\">Network</a></i> (1976)\n" +
            "</p><p>Nominated for three Academy Awards, won for <i>Stalag 17.</i>\n" +
            "</p>\n" +
            "</td></tr></tbody></table>\n" +
            "<h2><span class=\"mw-headline\" id=\"Nominees\">Nominees</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=AFI%27s_100_Years...100_Stars&amp;action=edit&amp;section=2\" title=\"Edit section: Nominees\">edit</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n" +
            "<p>The legends were chosen out of a list of 250 female and 250 male nominees. The adjoining reference gives the lists of the original selection.<sup id=\"cite_ref-:0b_4-0\" class=\"reference\"><a href=\"#cite_note-:0b-4\">&#91;4&#93;</a></sup>\n" +
            "</p><p>With the death of <a href=\"/wiki/Sidney_Poitier\" title=\"Sidney Poitier\">Sidney Poitier</a> in January 2022, all male living legends and nominees have now died.  There is one surviving female living legend, <a href=\"/wiki/Sophia_Loren\" title=\"Sophia Loren\">Sophia Loren</a> (88), and 8 remaining female nominees: <a href=\"/wiki/Angela_Lansbury\" title=\"Angela Lansbury\">Angela Lansbury</a> (97), <a href=\"/wiki/Gina_Lollobrigida\" title=\"Gina Lollobrigida\">Gina Lollobrigida</a> (95), <a href=\"/wiki/Ann_Blyth\" title=\"Ann Blyth\">Ann Blyth</a> (94), <a href=\"/wiki/Claire_Bloom\" title=\"Claire Bloom\">Claire Bloom</a> (91), <a href=\"/wiki/Mitzi_Gaynor\" title=\"Mitzi Gaynor\">Mitzi Gaynor</a> (91), <a href=\"/wiki/Rita_Moreno\" title=\"Rita Moreno\">Rita Moreno</a> (90), <a href=\"/wiki/Piper_Laurie\" title=\"Piper Laurie\">Piper Laurie</a> (90) &amp; <a href=\"/wiki/Margaret_O%27Brien\" title=\"Margaret O&#39;Brien\">Margaret O'Brien</a> (85). \n" +
            "</p> ";









}

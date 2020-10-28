(ns resume.data)

(def resume
  [:body
   [:h1 "Technologies"
    [:h2 "Languages"
     [:p (apply
          str
          (interpose
           ", "
           ["Clojure" "ClojureScript" "Lisp" "Javascript" "Python"
            "Java" "Bash" "SQL" "HTML" "CSS"]))]]
    [:h2 "Other technology"
     [:p (apply
          str
          (interpose
           ", "
           ["OAuth2" "OIDC" "Onyx" "Mesos" "Marathon" "NixOS" "GuixSD"
            "Druid" "CouchDB" "ElasticSearch" "Kibana" "Riemann" "AWS" "Docker" "docker-compose"
            "Kafka" "Zookeeper" "Linux" "NixOS" "Git" "Maven"
            "Leiningen" "Apache" "Nginx" "MongoDB" "PostgreSQL"
            "Redis" "React" "EC2" "S3" "Emacs" "org mode" "Travis"
            "Bamboo" "Jenkins"]))]]]
   [:h2 "Languages"
    [:p (apply
         str
         (interpose
          ", "
          ["English" "French" "Spanish"]))]]
   [:h2 "Interests"
    [:p (apply
         str
         (interpose
          ", "
          ["Traveling" "Home Theater" "Functional Programming" "Stream Computing" "Ant Farming."]))]]
   [:h1 "Talks"
    [:h2 "Fullstack Real time social media analytics with Clojure"
     [:p "Given at ClojureX, London, Dec 2015, The talk was about
leveraging Clojure to build a pipeline analyzing the twitter firehose API,
including sentiment analysis and real time metrics."]]

    [:h2 "Onyx: Stream computing for the Cloud with Clojure"
     [:p "Given at Lanbda Riviera, Sophia Antipolis, March 2018, I demonstrated the Onyx stream computing
library working with the Twitter Streaming API."]]]

   [:h1 "Experience"
    [:h2 "Technical Leader: Cisco [2016 - Present]"
     [:p "Cisco is the number one IT company in the world,\n
as customers are quickly migrating to cloud offerings,
a goal of the company is to switfly move from hardware sells to software and recurring revenues.\n
My team is part of the Security Business Group division (SBG) working on Advanced Threat Response and Advanced Malware Protection."]

     [:p "I am currently leading a distributed team dedicated to the backend services for both SecureX and Cisco Threat Response.\n
our mission is to build an Incident Response Orchestration Hub that integrates all the Cisco Security Product features into a single API.\n
for that purpose we are building a platform including:\n
an OAuth2 and OpenID Connect server to provide unified login experiences,\n
an open source Threat Intelligence API Server (CTIA) meant to easily share data using the Cisco Threat Intelligence Model (CTIM),\n
an API server that proxifies and translates all security product APIs and devices data on request,\n
Many integration modules for all Cisco Security Products.\n
Many API and data services to feed the product features.\n
A stream processing pipeline that ingests incoming Incident data to provide automated enrichments and custom hooks.\n
The stack comprises: Clojure, Clojurescript, Compojure API, ElasticSearch, Kibana, Redis, PostgreSQL, Kafka, Onyx, OAuth2, OIDC."]]

    [:h2 "Fullstack Clojure Developer: Vigiglobe [2013 - 2016]"
     [:p "Vigiglobe is a startup dedicated to real time social media analytics, working with major social media networks to provide statistics and insights
on any set of conversation topic in real time."]

     [:p "At Vigiglobe I was in charge of the design and the code of the whole platform architecture:"
      [:ul
       [:li "A scalable stream processing application"]
       [:li "A full API platform serving real time social media analytics"]
       [:li "A single page web application dashboard to display analytics"]
       [:li "Multiple data enrichment modules including Sentiment analysis, tokenization and gender detection"]
       [:li "A recurrent billing system."]]]

     [:p "in this position I was also in charge of:"]
     [:ul
      [:li "Hiring interviews and tests"]
      [:li "Building custom integrations for customers including: Kantar, Skynews, TNS and Twitter."]
      [:li "Performance benchmarks, tests and continuous delivery."]]]

    [:p "Techs: Clojure/Clojurescript, Javascript, Node.js, Reagent, Compojure API,
Websockets, Amazonica, Kafka, Zookeeper, Mesos, Marathon, Druid, Hystrix, Redis, MongoDB,
AngularJS , Docker, Twitter Streaming API, Gnip, Facebook Public Feed, Instagram API, some bits of Haskell"]

    [:h2 "R&D Software Engineer: Dolby Laboratories. [2011 - 2013]"
     [:p "At Dolby Laboratories we invented new experiences intended for moviegoers including
reinventing the movie theater lobby experience, gamifying preshows and overhauling digital signage."]]

    [:p "Created a Gaming data platform & APIS to support gaming experiences.\n
Developed a Production Network operating center to better track equipments.\n
Worked on an Integration Network operating center for device maintenance.\n
Created/Directed Gaming Mobile Web apps.\n
leveraged system administration and ticketing tools\n"]

    [:p "The tech we used included: Javascript, Python, Node.js, Redis, MongoDB, CouchDB, BigCouch, Perl, Zabbix, Proxmox,
Sencha Extjs, Sencha touch, Mysql, PostgreSQL, Spagobi, Websockets"]

    [:h2 "Software Developer: Orange Portal [2011]"
     [:p "Orange is the top french ISP, its portal serves billions of requests each day, our goal was to make it attractive."]
     [:p
      "At Orange I started bein in charge of the code for their new Finance portal.\n
I then pusrsued working on a new unified account platform & its APIS.\n
Finally intervened on many small advertising operations."]]

    [:h2 "Technical Project Manager: L'Express.fr [2010-2011]"
     [:p "L'Express.fr is a major news website in France, it is a main source for Live news and Politics."]
     [:p "I was in charge of the whole News website (lexpress.fr),\n
Working on adding/improving backend features and some frontend integration (mostly advertisement campaigns).\n
Concurrently I also was the Technical advisor for L’Express Emploi (Job board).\n
My main achievement was to migrate the website from a Microsoft stack to a LAMP stack based on the Symfony framework."]
     [:p "Tools included: Symfony, XML/XSLT, Talend, Microsoft SQL Server, Mysql"]]

    [:h2 "R&D Web Developer: Figaro Classifieds [2008-2010]"
     [:p "Figaro Classifieds is a a subcompany of Le Figaro french news,\n
it was created from the merge/aquisitions of many post dot com era classifieds websites inluding
 Cadremploi.fr, Explorimmo.com and Keljob.com.\n"]
     [:p "My work involved running experiments merging data from different classified universes building new websites & experiences.
in this position I built some R&D experiment Websites (Immobilier.com, emploi.com, kelformation)
and worked on a unified candidate sourcing tool.\n
I was also in charge of enhancing the internal tools including a media planning platform and a task tracker.\n"]
     [:p "techs included: Symfony, Talend, Java, Oracle DB"]]

    [:h2 "Web Developer: Linagora [2008]"
     [:p "Linagora is one of the main open source editors in France, supplying
open source alternatives for company software."]
     [:p "My tasks involved supporting various projects of the company including:\n
building websites for major government entities,\n
supporting the automated deployment of an open source document sharing solution."]
     [:p "Techs: Symfony, EZPublish, Javascript, Alfresco, Rhino, Fedora, Debian"]]

    [:h2 "Lead Developer: IAC Inter Action Consultants [2007]"
     [:p "IAC is a company providing software and services around Finance and Cost Optimization"]
     [:p "I worked on building the next flagship tool of their portfolio, Easybench which is a cost comparison/optimization
tool for the industry"]
     [:p "Tools included: Symfony and Extjs"]]

    [:h2 "Software Developer: Clever Age [2007]"
     [:p "Clever Age is a company providing services and tools around software engineering"]
     [:p "I worked on many customer projects including a news portal for seniors (mageneration.com),
and the revamp of the online store for a major French beauty group (LVMH Dior.com)"]
     [:p "Tools included: Symfony, EZPublish, Java"]]

    [:h2 "Web Developer Intern: Big Success [2004-2007]"
     [:p "Big Success is a network of small advertising companies targeting TV, press and social networks"]
     [:p "My work was about building a network of websites consolidating the brand, SEO optimizations and System Administration"]
     [:p "Tools included: Mambo!, Symfony, Debian Linux"]]]
   [:h1 "Education"
    [:h2 "IESA (Campus Edition Numerique)"
     [:ul [:li "Specialiste en bien de communication 2007"]]]
    [:h2 "ETS/IRIS"
     [:ul [:li "Computer Science Degree 2004"]]]]])

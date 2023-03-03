(ns resume.data)

(defn csv [items]
  (apply str (interpose ", " items)))

(def resume
  [:body
   [:h1 "Technologies"
    [:h2 "Languages"
     [:p (csv ["Clojure" "ClojureScript" "Lisp" "Javascript" "Python"
               "Java" "Bash" "SQL" "HTML" "CSS"])]]
    [:h2 "Other technology"
     [:p (csv ["Onyx" "Mesos" "Marathon" "NixOS" "GuixSD"
               "Druid" "CouchDB" "ElasticSearch" "Kibana" "Riemann" "AWS" "Docker" "docker-compose"
               "Kafka" "Zookeeper" "Linux" "NixOS" "Git" "Maven"
               "Leiningen" "Apache" "Nginx" "MongoDB" "PostgreSQL"
               "Redis" "React" "EC2" "S3" "Emacs" "org mode" "Travis"
               "OAuth2" "OIDC" "Bamboo" "Jenkins"])]]]
   [:h2 "Languages"
    [:p (csv ["English" "French" "Spanish"])]]
   [:h2 "Interests"
    [:p (csv ["Traveling" "Home Theater" "Home Automation" "Functional Programming"
              "Stream Computing" "Roasting" "Ant Farming"])]]
   [:h1 "Talks"
    [:h2 "Fullstack Real time social media analytics with Clojure"
     [:p "Given at ClojureX, London, Dec 2015, The talk was about
leveraging Clojure to build a pipeline analyzing the twitter firehose API,
including sentiment analysis and real time metrics."]]
    [:h2 "Onyx: Stream computing for the Cloud"
     [:p "Given at Lambda Riviera, Sophia Antipolis, March 2018, I demonstrated the Onyx stream computing
library working with the Twitter Streaming API."]]]
   [:h1 "Experience"
    [:h2 "Technical Leader: Cisco [2016 - Present]"
     [:p "Cisco is the number one IT company in the world,\n
as customers are quickly migrating to cloud offerings,
a goal of the company is to rapidly move the business from hardware to software and recurring revenues.\n
My team is part of the Security Business Group division (SBG),\n
working on Advanced Threat Response and Advanced Malware Protection."]
     [:p "I am currently leading a distributed team dedicated to the backend services for both SecureX and Cisco Threat Response.\n
our mission is to build an Incident Response Orchestration Hub that integrates all the Cisco Security Product features into a single API.\n
for that purpose we are building a platform including:\n"
      [:ul
       [:li "an OAuth2 and OpenID Connect server providing unified login experiences"]
       [:li "an open source Threat Intelligence API Server (CTIA) meant to easily share data using the Cisco Threat Intelligence Model (CTIM)"]
       [:li "a translation layer proxifying and translating all security product APIs and devices data on request"]
       [:li "Many integration modules for all Cisco Security Products"]
       [:li "Many API and data services to feed the product features"]
       [:li "A stream processing pipeline that ingests incoming Incident data to provide automated data enrichments and custom hooks"]]]
     [:p "Techs: Clojure, Clojurescript, Compojure API, ElasticSearch, Kibana, Redis, PostgreSQL, Kafka, Onyx, OAuth2, OIDC."]]

    [:h2 "Fullstack Clojure Developer: Vigiglobe [2013 - 2016]"
     [:p "Vigiglobe is a startup dedicated to real time social media analytics, working with major social media networks to provide statistics and insights
on any set of conversation topic in real time."]
     [:p "At Vigiglobe I was in charge of the design and the code of the whole platform architecture:"
      [:ul
       [:li "A scalable stream processing application"]
       [:li "A full API platform serving real time social media analytics"]
       [:li "A single page web application dashboard to display the data"]
       [:li "Multiple data enrichment modules including Sentiment analysis, tokenization and gender detection"]
       [:li "A recurring billing and entitlements system"]]]
     [:p "in this position I was also in charge of:"]
     [:ul
      [:li "Hiring interviews and tests"]
      [:li "Building custom integrations for customers including: Kantar, Skynews, TNS and Twitter."]
      [:li "Performance benchmarks, tests and continuous delivery."]]]

    [:p "Techs: Clojure/Clojurescript, Javascript, Node.js, Reagent, Compojure API,
Websockets, Amazonica, Kafka, Zookeeper, Mesos, Marathon, Druid, Hystrix, Redis, MongoDB,
AngularJS , Docker, Twitter Streaming API, Gnip, Facebook Public Feed, Instagram API, some bits of Haskell"]

    [:h2 "R&D Software Engineer: Dolby Laboratories. [2011 - 2013]"
     [:p "At Dolby Laboratories we invented new experiences for moviegoers like
reinventing the movie theater lobby experience, gamifying preshows and overhauling digital signage."]
     [:p "My job was mostly focused on building the data platform for all these experiences:"]
     [:ul
      [:li "Created a Gaming data platform & APIS"]
      [:li "Developed a Production Network operating center tracking devices" ]
      [:li "Worked on an Integration Network operating center for device maintenance"]
      [:li "Created/Directed Gaming Mobile Web apps"]
      [:li "leveraged system administration ticketing/inventory tools"]]
     [:p "Techs: Javascript, Python, Node.js, Redis, MongoDB, CouchDB, BigCouch, Perl, Zabbix, Proxmox,
Sencha Extjs, Sencha touch, Mysql, PostgreSQL, Spagobi, Websockets"]]

    [:h2 "Software Developer: Orange Portal [2011]"
     [:p "Orange is the top french ISP, its portal serves billions of requests each day, our goal was to make it attractive."]
     [:p "I started being in charge of the code for their new Finance portal.\n
I then pursued working on a new unified account platform & its APIS.\n
Finally I participated working on many small advertising operations."]]

    [:h2 "Technical Project Manager: L'Express.fr [2010-2011]"
     [:p "L'Express.fr is a major news website in France, it is a main source for Live news and Politics."]
     [:p "I was in charge of the whole News website L'Express.fr:"
      [:ul
       [:li "Working on adding/enhancing backend features"]
       [:li "Worked on some frontend integrations, marketing campaigns"]
       [:li "Technical advisor for L’Express Emploi (Job board)"]]]
     [:p "My main achievement was to migrate the website from a Microsoft stack to a LAMP stack based on the Symfony framework."]
     [:p "Techs: Symfony, XML/XSLT, Talend, Microsoft SQL Server, Mysql"]]

    [:h2 "R&D Web Developer: Figaro Classifieds [2008-2010]"
     [:p "Figaro Classifieds is a a subcompany of Le Figaro french news,\n
it was created from the merge/aquisitions of many post dot com era classifieds websites including Cadremploi.fr, Explorimmo.com and Keljob.com.\n"]
     [:p "My work involved running experiments merging data from different classified universes, building new websites & experiences.\n
in this position I built some R&D experiments:"
      [:ul
       [:li "Immobilier.com, emploi.com, kelformation"]
       [:li "A unified job candidate sourcing tool"]]]
     [:p "I was also in charge of enhancing the internal tools including a media planning platform and a task tracker."]
     [:p "techs included: Symfony, Talend, Java, Oracle DB"]]

    [:h2 "Web Developer: Linagora [2008]"
     [:p "Linagora is one of the main open source editors in France, supplying
open source alternatives for enterprise software."]
     [:p "My tasks involved supporting various projects of the company including:"
      [:ul
       [:li "Websites creation for government entities"]
       [:li "Developing automated deployments for Alfresco"]]]
     [:p "Techs: Symfony, EZPublish, Javascript, Alfresco, Rhino, Fedora, Debian"]]

    [:h2 "Lead Developer: IAC Inter Action Consultants [2007]"
     [:p "IAC is a company providing software and services around Finance and Cost Optimization."]
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
     [:p "Tools included: Mambo!, PHP, Symfony, Debian Linux"]]]

   [:h1 "Education"
    [:h2 "IESA (Campus Edition Numerique)"
     [:ul [:li "Specialiste en bien de communication 2007"]]]
    [:h2 "ETS/IRIS"
     [:ul [:li "Computer Science Degree 2004"]]]]])

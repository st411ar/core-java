javac RoadApplet.java
jar cvfm RoadApplet.jar RoadApplet.mf *.class
del *.class
appletviewer RoadApplet.html

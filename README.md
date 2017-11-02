# What is this??

The Imperial Assault Skirmish Specification is a standard way of allowing you to exchange your armies between various tools.
It provides a common json data structure that can be implemented by tools to either import or export Skirmish armies and the
related command cards.   This repository consists of the following:

* commandsDB.json - json data file with all known command cards.
* deploymentDB.json - json data file with all known deployment cards.
* jsonschema_IASpec.json - A JSon Schema describing the IASpecification.
* Libraries that can be used to read and write the format:
  * Java - skirmish-data - uses Jackson 2.9.2.
  * PHP - in development
  
# Implementors

The following is a list of known implementors of the specification.  If you would like your application
added to this list please submit a pull request or open an issue.

* Tabletop Admiral - http://tabletopadmiral.com/imperialassault
* X-Streamer - https://github.com/NineWorlds/xstreamer
* Imperial Assault Vassal Module - coming soon!


# Documentation
Imperial Assault Data Project.  Includes JSON data and format specification.

All documentation for this project currently resides in the Wiki.

JSON files exist for deployments and command cards.  These can be used to pre-populate an army builder database, be used by a web app to provide data when hovering over text, or used to help create and display armys in streaming overlays.

In addition, Java libraries exist (or soon will) that can read and write the iaspec data specification.


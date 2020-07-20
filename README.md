# CORD-19 Search

> A metasearch engine built with Elasticsearch, Springboot, React and Redux.

## About
CORD-19 Search provides search capability to the COVID-19 Open Research Dataset (CORD-19). Over 13GB of research literature on COVID is accessible and searchable. The goal of this tool is to provide researchers the capability to perform meta-analysis on the existing studies on COVID-19.

## Running Locally

Running locally requires you have yarn, elasticsearch, and java installed.

To run CORD-19 Search locally, first clone the repo

Then `cd` to the `ui` directory

Install the dependencies with `yarn install`

Then run `yarn start` to run the client side code. The app should be visible on port 3000.

Go to your elasticsearch `bin` folder and run `elasticsearch.bat` in a terminal.

Install the server dependencies using maven (`pom.xml` is in the project root).

`cd` to `src/main/java/ew/cord19`

Run `CordSearchApplication.java` to start the server.

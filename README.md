# CORD-19 Search

> A metasearch engine built with Elasticsearch, Springboot, React and Redux.

## About
CORD-19 Search provides search capability to the COVID-19 Open Research Dataset (CORD-19). Over 13GB of research literature on COVID is accessible and searchable. The goal of this tool is to provide researchers the capability to perform meta-analysis on the existing studies on COVID-19.

## Next Steps
Provide more complex filtering options for papers (authors, categories)

Optimize elasticsearch query capability for more relevant results

Create a bibliography graph that links papers to the papers they referenced

Assign documents with similarity scores and visualize similar documents as plots in 2d space by using dimensionality reduction techniques (t-SNE, PCA) to map similarity vectors down to 2d



## Running Locally

Running locally requires you have nodejs, yarn, elasticsearch, and java installed.

To run CORD-19 Search locally, first clone the repo

Then `cd` to the `ui` directory

Install the dependencies with `yarn install`

Then run `yarn start` to run the client side code. The app should be visible on port 3000.

Go to your elasticsearch `bin` folder and run `elasticsearch.bat` in a terminal.

Install the server dependencies using maven (`pom.xml` is in the project root).

`cd` to `src/main/java/ew/cord19`

Run `CordSearchApplication.java` to start the server.

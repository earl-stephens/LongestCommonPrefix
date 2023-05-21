# Longest Common Prefix

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
![Sonarlint](https://img.shields.io/badge/SonarLint-CB2029?style=for-the-badge&logo=sonarlint&logoColor=white)
![Maven](https://badgen.net/badge/icon/maven?icon=maven&label)
![LeetCode](https://img.shields.io/badge/LeetCode-000000?style=for-the-badge&logo=LeetCode&logoColor=#d16c06)


## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)  
- [Getting Started](#getting-started)  
- [Further Improvements](#further-improvements)  
- [Built With](#built-with)  
- [Coverage](#coverage)  
- [Authors](#authors)  

## Introduction

This project was a LeetCode challenge.  The concept is to iterate through an array of strings and see if they all have a common prefix.  If so, find the longest common prefix and display it to the user. 

First, I sorted the array based on the length of each word.  I then initialized an instance variable outputString to "".  This is what would be returned if there were no common prefixes.

Next, a for loop was created, which would iterate over the characters in the words.  The max number of iterations is set to the length of the shortest word, so as to avoid any out of bound errors.

Inside the for loop is a nested for loop which iterates over every word in the array.  A local array is used to store the output of word.toCharArray.  The local array is turned to a stream, and the distinct() method is called on it.  If there are common prefixes, the count of the distinct() output should be 1.  If the value is one, the value of the outputString is updated, then the intermediate array is cleared and the next iteration of the outside for loop is called to check for the next letter in the prefix.  If the value is not 1, then the value of the outputString is returned. 

## Installation

Clone this repo from Github and install it on your machine

## Getting Started   

Once the repo has been cloned, perform a Maven install (from the CLI: `mvn install`).  Next, run the JUnit tests to verify there are no failures.  This program does not have a main method to run.

## Further Improvements

I would like to research other methods of finding the common prefixes, such as some form of a sort method.

## Built With

OpenJDK 17.0.6

JUnit 5  

Eclipse 2020-06  

## Coverage

## Authors

[Earl Stephens](https://github.com/earl-stephens)

# HOL3 - Working with Remote Repositories (Push/Pull)

## Commands used:

git remote -v

git push origin main

git pull origin main

## Explanation:

This repository (Cognizant-DN5-Java-FSE) is itself connected to a remote

on GitHub (origin). Throughout this project, changes made locally were

staged, committed, and pushed to the remote using:

git push origin main

Example real output from this repo:

Enumerating objects: 6, done.

Counting objects: 100% (6/6), done.

Writing objects: 100% (5/5), 432 bytes | 432.00 KiB/s, done.

To https://github.com/swethaganesh5/Cognizant-DN5-Java-FSE.git

1ee546e..1471738 main -> main

To pull the latest changes from the remote (in case teammates pushed changes):

git pull origin main

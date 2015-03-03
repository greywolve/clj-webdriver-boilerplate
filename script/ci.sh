#!/bin/bash
#
# Runs tests on CI.
#

sudo apt-get -y purge firefox
sudo apt-get -y install firefox=28.0+build2-0ubuntu2

lein test

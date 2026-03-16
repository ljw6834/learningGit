# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

A minimal Java/Maven project used for learning Git workflows (branching, merging, pushing).

## Build Commands

- **Build:** `mvn compile`
- **Clean build:** `mvn clean compile`
- **Package:** `mvn package`

Requires Java 8+ and Maven installed.

## Architecture

- **Build system:** Maven (`pom.xml`), targeting Java 8
- **Package:** `com.aaa.learningGit`
- **Source directory:** `src/main/java/`
- Two simple POJO classes (`Student`, `Book`) with fields and getters/setters
- No test directory, dependencies, or frameworks — pure JDK only

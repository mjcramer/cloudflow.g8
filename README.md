# Cloudflow Project Template 

A [Giter8](http://www.foundweekends.org/giter8/) template for Lightbend Cloudflow projects 

## Usage
```
$ git clone git@github.com:mjcramer/cloudflow.g8.git
$ g8 file://cloudflow.g8
```
or 
```
$ g8 mjcramer/cloudflow.g8 
```

## Development and Testing
```
sbt g8Test
```

## Release Process

Commit all code to the current branch
```bash
git add .
git commit -m "commit message"
```
Tag the current snapshot with the version, e.g. "1.2.3"
```bash
git tag -a 0.2.0 -m "basic functionality"
```
Publish the current version
```bash
sbt publish
```


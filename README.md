or create a new repository on the command line

echo "# TestPush3" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/rahulsoni16/TestPush3.git
git push -u origin master

…or push an existing repository from the command line

git remote add origin https://github.com/rahulsoni16/TestPush3.git
git push -u origin master

…or import code from another repository

You can initialize this repository with code from a Subversion, Mercurial, or TFS project.


=======================

rahul.soni@BLRKEC148265L MINGW64 /d/Rahul/Tech/github/JavaFeatures (master)
$ rm -rf .git
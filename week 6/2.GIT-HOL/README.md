# HOL2 - Branching and Merging

## Commands used:
git branch feature-branch
git checkout feature-branch
echo "This is a new feature" > feature.txt
git add feature.txt
git commit -m "HOL2: Add feature.txt on feature-branch"
git checkout main
git merge feature-branch

## Output:

Switched to branch 'feature-branch'
[feature-branch e1802d8] HOL2: Add feature.txt on feature-branch
1 file changed, 0 insertions(+), 0 deletions(-)
create mode 100644 feature.txt
Switched to branch 'main'
Updating 5e0b581..e1802d8
Fast-forward
feature.txt | Bin 0 -> 48 bytes
1 file changed, 0 insertions(+), 0 deletions(-)
create mode 100644 feature.txt

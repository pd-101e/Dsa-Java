# Git

Git
The command git checkout -b <branchname> is used to create and switch to a new branch in Git. It is a shortcut for the following two commands:

git branch <branchname>: This creates a new branch with the given name.
git checkout <branchname>: This switches the current working branch to the new branch.
The new branch will be based on the current branch or the specified start point. For example, if you want to create a new branch called feature from the master branch, you can use:

git checkout -b feature master
This command is useful when you want to work on a new feature or bug fix without affecting the main branch. You can find more information about this command and its options in the Git documentation or in these web tutorials123.

The command git push --set-upstream origin test-branch is used to push the local branch test-branch to the remote repository origin and set it as the upstream branch for the local branch. This means that the next time you push or pull from the local branch, you don’t have to specify the remote branch name, as Git will use the upstream branch as the default12. This command is useful when you want to create a new branch on the remote repository and keep it in sync with your local branch34. You can find more information and examples about this command in the [Git documentation] or in these web tutorials234.


The command git fetch --all is used to fetch all branches and/or tags from all remotes1. It is a power move that updates the local copies of remote branches without affecting the local branches2. However, this command will not create or update the local branches that track the remote branches. To do that, you need to use git branch --track and git pull --all commands1. You can find more information and examples about this command in the Git documentation or in these web tutorials34.

Origin is the name of the remote repository where you want to push your changes. It is usually the default name given by Git when you clone a repository, but you can also change it or add more remotes12.

The -d option in git push -d origin is used to delete a branch from the remote repository. It is equivalent to --delete3. For example, if you want to delete a branch called test-branch from the remote repository origin, you can use:

git push -d origin test-branch
This command will remove the branch test-branch from the remote repository origin, but it will not affect your local branch. To delete your local branch, you need to use:

git branch -d test-branch
You can find more information and examples about these commands in the Git documentation or in these web tutorials

![image](https://github.com/pd-101e/Dsa-Java/assets/59065854/554d5aeb-c861-4c13-88a4-0c19cd63bdab)

The command git log --oneline is used to show the commit history in a concise and simple way. It displays the abbreviated commit hash and the first line of the commit message for each commit. For example:

9bee8857 Write more code
831fdd6e Write some code
This command is useful when you want to get a quick overview of the changes in your repository, or when you want to cherry-pick or rebase specific commits. You can find more information and examples about this command in the Git documentation or in these web tutorials12

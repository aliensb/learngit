#git笔记
##git的大概流程
1. 创建git的仓库`git init`
2. 创建文件`touch 1.txt`
3. 将创建的文件添加到暂存区`git add 1.txt`
4. 确认没有问题后，提交代码`git commit -m "提交修改的说明"`
5. 修改了1.txt添加了一行内容，要行查看修改前和修改后的区别，就使用`git diff 1.txt`
6. 修改了1.txt但是没有`git add 1.txt`（提交到暂存区），如果要恢复修改前的状态，也就是放弃修改，则使用`git chekout -- 1.txt`（中间的的--不能省略），这样就放弃了对`1.txt`的修改。
7. 如果修改了1.txt并且已经`git add 1.txt`（提交到暂存区）了，那就要使用`git reset HEAD readme.txt`来清除在暂存区的`1.txt`的修改，然后在使用`git chekout -- 1.txt`来放弃对`1.txt`的修改
8. `git log`可以查看提交的信息，包括版本号结果如下
`$ git log`
`commit e8cf664dc19b66630e6373bbd4d1986222e9fe6c`
`Author: aliensb <aliensb@live.com>`
`Date:   Sun Mar 5 23:36:46 2017 +0800`
    `反射的基本运用，最主要的代码在ClassUtil.java里面`
`commit af1de2a0f55fe5f6a665664f638dc5446d6a0331`
`Author: aliensb <aliensb@live.com>`
`Date:   Sun Mar 5 13:41:19 2017 +0800`
`   add distributed`
`commit 79898f087f68dc3695351312660cb4ac5e77c989`
`Author: aliensb <aliensb@live.com>`
`Date:   Sun Mar 5 13:23:34 2017 +0800`
`    wrote a readme file`
9. 比如要回退到`add ditributed`就是第二个阶段，就用`git rest --hard af1de2a`即可，格式化查看提交情况用`git log --pretty=oneline`
10. 如果回退到了第二个版本，那么在使用`git log`就不能看到地三阶段的commitid了，此时就只能用`git reflog查看所有的提交情况`
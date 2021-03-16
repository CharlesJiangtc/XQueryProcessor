import os

file_list = ["fw0.txt"]
# , 
# , 
for curFile in file_list:
    testIndex = curFile[2]
    genOutNaive = "java -jar XDB.jar {0} truu".format(curFile)
    print(genOutNaive)
    os.system(genOutNaive)
    naiveOut = "{0}naive.xml".format(testIndex)
    getNaiveOut = "mv xdbResult.xml result/{0}".format(naiveOut)
    print(getNaiveOut)
    os.system(getNaiveOut)
    joinFileName = "join{0}.txt".format(testIndex)
    joinOut = "{0}.xml".format(testIndex)
    genOutJoin = "java -jar XDB.jar {0} true".format(curFile)
    print(genOutJoin)
    os.system(genOutJoin)
    getJoinFile = "mv rewriteQuery.txt {0}".format(joinFileName)
    print(getJoinFile)
    os.system(getJoinFile)
    getJoinOut = "mv xdbResult.xml result/{0}".format(joinOut)
    print(getJoinOut)
    os.system(getJoinOut)
    
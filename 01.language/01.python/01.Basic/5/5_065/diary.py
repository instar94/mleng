import time

def writeDiary(u,f,d):
    lt = time.localtime()
    timeStr=time.strftime("%Y-%m-%d %I:%M:%S %p", lt)
    filePath= u+f
    with open(filePath, "a") as f:
        f.write(f"[{timeStr}] {d}\n")

def readDiary(u,f):
    filePath=u+f
    dates=[]
    with open(filePath, "r") as f:
        dates=f.readlines()
    return dates

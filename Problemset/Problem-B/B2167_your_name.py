import sys

def main():
  try:
    testCase = int(sys.stdin.readline().strip())
    
    for _ in range(testCase):
      line = sys.stdin.readline().strip()
      if not line:
        line = sys.stdin.readline().strip()
      
      first, second = line.split()
      
      if sorted(first.lower()) == sorted(second.lower()):
        print("YES")
      else:
        print("NO")
              
  except Exception as e:
    print(f"Error: {e}", file=sys.stderr)


def println(o):
  print(o)


def printNumArr2D(n):
  for t in n:
    print(t, end=" ")
  print()


if __name__ == "__main__":
  main()
def main():
    str_input = input()
    explosive_string = input()

    while len(str_input) > 0:
        index = str_input.find(explosive_string)
        if index == -1:
            print(str_input)
            return
        str_input = str_input[:index] + \
            str_input[index + len(explosive_string):]

    print("FRULA")


if __name__ == "__main__":
    main()

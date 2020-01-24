class Person:

    def __init__(self, initial_age):
        if initial_age<0:
            print("Age is not valid, setting age to to 0.")
            self.age =0
        else:
            self.age = initial_age

    def am_i_old(self):
        if self.age<13:
            print("You are young.")
        elif self.age<18:
            print("You are a teenager")
        else:
            print("You are old.")

    def year_passes(self):
        self.age+=1

if __name__ == "__main__":
    ages = [-1,10,16,18]

    for age in ages:
        person = Person(age)
        person.am_i_old()
        for i in range(3):
            person.year_passes()
        person.am_i_old()
        print("\n")
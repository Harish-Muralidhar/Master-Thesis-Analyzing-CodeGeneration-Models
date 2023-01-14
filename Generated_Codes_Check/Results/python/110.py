"""



"""

import re
from collections import defaultdict

sales = defaultdict(lambda :defaultdict(lambda :defaultdict(lambda :defaultdict(lambda :defaultdict(lambda :0)))))
provinces = defaultdict(lambda :defaultdict(lambda :defaultdict(lambda :defaultdict(lambda :defaultdict(lambda :0)))))

#sales[product][size][province][city][region][gender][age] = 0

#provinces[province][city][region][gender][age] = 0

class Sale:
	def __init__(self,line):
		self.line = line
		self.parse()
		self.process()
		#print self.product,self.size,self.province,self.city,self.region
		#print "sale data: ",self.gender,self.age,self.units
		
	def parse(self):
		self.product,self.province,self.gender,self.age,self.units = self.line.split()
		self.product = int(self.product.split(".")[0])
		self.size = int(self.product.split(".")[1])
		self.province = int(self.province.split(".")[0])
		self.city = int(self.province.split(".")[1])
		self.region = int(self.province.split(".")[2])
		self.age = int(self.age)
		self.units = int(self.units)
		
	def process(self):
		sales[self.product][self.size][self.province][self.city][self.region][self.gender][self.age] += self.units
		provinces[self.province][self.city][self.region][self.gender][self.age] += self.units
		
		
class Query:
	def __init__(self,line):
		self.line = line
		self.parse()
		#print self.product,self.size,self.province,self.city,self.region
		#print "query data: ",self.gender,self.start_age,self.end_age
		
	def parse(self):
		self.product,self.province,self.gender,self.age = self.line.split()
		self.product = int(self.product.split(".")[0])
		self.size = int(self.product.split(".")[1])
		self.province = int(self.province.split(".")[0])
		self.city = int(self.province.split(".")[1])
		self.region = int(self.province.split(".")[2])
		self.start_age = int(self.age.split("-")[0])
		self.end_age = int(self.age.split("-")[1])
		
	def run(self):
		if self.product == -1 and self.province == -1:
			for p in sales.keys():
				for s in sales[p].keys():
					for pr in sales[p][s].keys():
						for c in sales[p][s][pr].keys():
							for r in sales[p][s][pr][c].keys():
								for g in sales[p][s][pr][c][r].keys():
									for a in sales[p][s][pr][c][r][g].keys():
										if g == self.gender and a >= self.start_age and a<=self.end_age:
											print sales[p][s][pr][c][r][g][a],
											
		elif self.product == -1:
			for p in sales.keys():
				for s in sales[p].keys():
					for pr in sales[p][s].keys():
						if pr == self.province:
							for c in sales[p][s][pr].keys():
								if c == self.city:
									for r in sales[p][s][pr][c].keys():
										if r == self.region:
											for g in sales[p][s][pr][c][r].keys():
												if g == self.gender:
													for a in sales[p][s][pr][c][r][g].keys():
														if a >= self.start_age and a<=self.end_age:
															print sales[p][s][pr][c][r][g][a],
															
		elif self.province == -1:
			for p in sales.keys():
				if p == self.product:
					for s in sales[self.product].keys():
						if s == self.size:
							for pr in sales[self.product][self.size].keys():
								for c in sales[self.product][self.size][pr].keys():
									for r in sales[self.product][self.size][pr][c].keys():
										for g in sales[self.product][self.size][pr][c][r].keys():
											if g == self.gender:
												for a in sales[self.product][self.size][pr][c][r][g].keys():
													if a >= self.start_age and a<=self.end_age:
														print sales[self.product][self.size][pr][c][r][g][a],
														
		else:
			for p in sales.keys():
				if p == self.product:
					for s in sales[self.product].keys():
						if s == self.size:
							for pr in sales[self.product][self.size].keys():
								if pr == self.province:
									for c in sales[self.product][self.size][pr].keys():
										if c == self.city:
											for r in sales[self.product][self.size][pr][c].keys():
												if r == self.region:
													for g in sales[self.product][self.size][pr][c][r].keys():
														if g == self.gender:
															for a in sales[self.product][self.size][pr][c][r][g].keys():
																if a >= self.start_age and a<=self.end_age:
																	print sales[self.product][self.size][pr][c][r][g][a],
																	
	
		
def main():
	input_count = int(raw_input())
	for i in range(input_count):
		line = raw_input()
		operation = line[0]
		if operation == 'I':
			sale = Sale(line[2:])
		elif operation == 'Q':
			query = Query(line[2:])
			query.run()
			print
			
if __name__ == "__main__":
	main()
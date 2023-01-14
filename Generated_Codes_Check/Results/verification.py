import re
import pandas as pd
import subprocess
import os


def extract_subtext(start_text, end_text, filepath):
    pattern_start = re.compile(rf"{start_text}")
    pattern_stop = re.compile(rf"{end_text}")

    i = 0
    extract_on = False
    extracts = []
    with open(rf"{filepath}", 'rt', encoding="UTF-8") as myfile:
        for line in myfile:
            i += 1  # line counting starts with 1
            if pattern_start.match(line):
                extract_on = True
            if pattern_stop.search(line):
                extract_on = False
            if extract_on:
                extracts.append(line)


    sample = extracts[1:]
    sample = "".join(sample)

    return sample


def get_output(sample_input, file_path, engine, name):
    try:
        if name in ["14.java"]:
            raise Exception
        proc = subprocess.Popen([engine, file_path], stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
        out, _ = proc.communicate(bytes(sample_input, "utf-8"))
        output_ = out.decode('utf-8').strip()
        return output_
    except:
        return "ERROR"


def get_status(generated_output, sample_output):
    if sample_output.strip() == generated_output.strip():
        status = "Success"
    else:
        status = "Failure"
    return status
"""
# To extract sample input and output
data = pd.read_excel(".\\verification_data_java.xlsx")
data.fillna('', inplace=True)

sample_input_beginning = "Input:"
sample_input_end = "Output:"
sample_output_beginning = "Output:"
sample_output_end = "Explanation"

for index, row in data.iterrows():
    file_path = row["path"]
    data.at[index,'sample_input'] = extract_subtext(sample_input_beginning, sample_input_end, file_path)
    data.at[index,'sample_output'] = extract_subtext(sample_output_beginning, sample_output_end, file_path)

print(data)
# data.to_excel("samples.xlsx", index=False)
"""

data = pd.read_excel(".\\samples.xlsx")
data.fillna('', inplace=True)
python_output_path = ".\\python"
java_output_path = ".\\java"
python_engine = "python"
java_engine = "java"

for index, row in data.iterrows():
    id = row["task_id"]
    filename = f"{id}.java"
    print(filename)
    path_name = os.path.join(java_output_path,filename)
    generated_output = get_output(row["sample_input"], path_name, python_engine, filename)
    data.at[index, "java_code_output"] = generated_output
    status = get_status(generated_output, row["sample_output"])
    data.at[index, "status"] = status
    print(status)

data.to_excel("report_java.xlsx",index=False)

